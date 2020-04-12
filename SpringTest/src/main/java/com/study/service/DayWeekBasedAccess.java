package com.study.service;


import java.util.*;
import java.text.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayWeekBasedAccess extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest req , HttpServletResponse res ,Object handler) throws Exception{
		Calendar cal =Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		if(dayOfWeek==2){
		res.getWriter().write("Application is shutdown due to maintance on sunday");
		 return false;
		}
		return true;
	}
	@Override
	public void postHandle(HttpServletRequest req , HttpServletResponse res , Object handler,ModelAndView mv) throws Exception{
		System.out.println("postHandle method"+req.getRequestURI().toString());
		
	}
	
	@Override
	public void afterCompletion(HttpServletRequest req , HttpServletResponse res , Object handler ,Exception e)throws Exception{
		System.out.println("afterCompletion method"+req.getRequestURI().toString());
		
	}
}
