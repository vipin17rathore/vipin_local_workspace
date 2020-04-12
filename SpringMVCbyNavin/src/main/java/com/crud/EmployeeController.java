package com.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
@Autowired
EmployeeDao dao;

	@RequestMapping("/empform")  
	public ModelAndView showform(){  
	    return new ModelAndView("crud_save","command",new Employee());  
	} 

	@RequestMapping(value="/empSave",method=RequestMethod.POST)
	public ModelAndView empSave(@ModelAttribute("emp") Employee emp) {
		
		dao.Save(emp);
		return null;
		
	}
}
