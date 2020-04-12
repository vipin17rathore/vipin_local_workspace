package com.tcs;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
@RequestMapping("myController")
	public ModelAndView myController(@RequestParam("myName") String name, Model model ) {
	
	String result ="My name is ::"+name;
	
	ModelAndView mv = new ModelAndView();
	mv.setViewName("display");
	mv.addObject("result", result);
	return mv;
		
	}

}
