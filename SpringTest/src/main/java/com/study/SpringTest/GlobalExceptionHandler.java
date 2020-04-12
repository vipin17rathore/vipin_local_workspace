package com.study.SpringTest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	
    @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=ArithmeticException.class)
    public ModelAndView ArithmeticExceptionHanler(){
    	System.out.println("ArithmeticExceptionHanler");
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("Exception", "ArithmeticException");
    	mv.setViewName("Exception");
		return mv;
    }
    
    @ExceptionHandler(value=NullPointerException.class)
    public ModelAndView NullPointerExceptionHanler(){
    	System.out.println("NullPointerExceptionHanler");
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("Exception", "NullPointerException");
    	mv.setViewName("Exception");
		return mv;
    }
    
   /* @ExceptionHandler(value=Exception.class)
    public ModelAndView ExceptionHandler(){
     	System.out.println("ExceptionHandler");
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("Exception", "Exception");
    	mv.setViewName("Exception");
		return mv;
    }*/
}
