/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.study.SpringTest;

import java.beans.PropertyEditor;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;

import javax.validation.*;

import com.study.dao.Student;
import com.study.service.StudentNameEditor;

@Controller
public class SimpleService {
    
	@RequestMapping(value="/Form" ,method=RequestMethod.GET)
    public ModelAndView form() throws Exception{
		//System.out.println("inside from contoller");
		int a = 10/0;
		System.out.println("a"+a);
		ModelAndView mv = new ModelAndView("Form");
		mv.addObject("heading", "Student Admission form");
		return mv;
    }
    
    @InitBinder
    public void InitBinder(WebDataBinder binder){
    	binder.setDisallowedFields(new String[] {"dob"});
    /*	SimpleDateFormat sm = new SimpleDateFormat("DD-MM-YY");
    	binder.registerCustomEditor(Date.class, "dob", (PropertyEditor) new CustomEditorConfigurer(sm,false));
    */	
    	binder.registerCustomEditor(String.class,"name",new StudentNameEditor());
    }
    
    @ModelAttribute
    public void commonForAllMetod(Model model){
		model.addAttribute("headDetails","IIST college");
    }
    
    @ResponseStatus(value=HttpStatus.NOT_FOUND ,reason="vipin")
    @RequestMapping(value="/stuForm" , method= RequestMethod.POST)
    public ModelAndView StudentForm(@Valid @ModelAttribute("student") Student student ,BindingResult result /*@RequestParam("name") String name, @RequestParam("stream") String stream*/){
		/*Student st = new Student();
		st.setName(name);
		st.setStream(stream);
		*/
    	if(result.hasErrors()){
    		ModelAndView mv = new ModelAndView();
    		mv.setViewName("Form");
    		return mv;
    	}
    	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Result");
		//mv.addObject("headDetails", "Student Detials is:");
	//	mv.addObject("student", st);
		
	return mv;
    	
    }
}
