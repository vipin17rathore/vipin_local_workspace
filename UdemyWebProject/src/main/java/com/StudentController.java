package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")

public class StudentController {
	
	public String showForm(Model md) {
		
		Student st = new Student();
	//	md.addAttribute("student",st);
		return "StudentForm";
	}
}
