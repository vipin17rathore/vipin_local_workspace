package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShowController {

	@RequestMapping("/show")
	public String showForm() {
		return "show-form";
	}
	
	@RequestMapping("/process")
	public String processForm() {
		return "process-form";
	}
	
	@RequestMapping("/model")
	public String pageDataView(HttpServletRequest req ,Model md) {
		
		String name = req.getParameter("name");
	    name = name.toUpperCase();
	    
	    name = "Yo-"+name;
	    md.addAttribute("message",name);
		
		return "process-form";
	}
	
	@RequestMapping("/reqParam")
     public String pageDataViewRequestParam(@RequestParam("name") String name,Model md) {
		
		//String name = req.getParameter("name");
	    name = name.toUpperCase();
	    
	    name = "Yo Req Param-"+name;
	    md.addAttribute("message",name);
		
		return "process-form";
	}
}
