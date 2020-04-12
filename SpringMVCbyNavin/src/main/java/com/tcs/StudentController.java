package com.tcs;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("studentcont")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm( Model theModel) {
	System.out.println("inside this");
    Student st = new Student();
	theModel.addAttribute("student", st);
		return "Registration";	
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("firstName is::"+theStudent.getFirstName()+",lastName::"+theStudent.getLastName() +"country:"+theStudent.getCountry() );
		return "confirm";	
	}	
	



}
