package com.study.SpringTest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.service.AddService;
import com.study.service.CheckConnection;

@Controller
public class AddController {
@RequestMapping(value="/add" , method=RequestMethod.POST)
	public ModelAndView add(@RequestParam("txt1") String user,@RequestParam("txt2") String pass /*HttpServletRequest req*/){
		/*String user = req.getParameter("txt1");
		String pass = req.getParameter("txt2");*/
		System.out.println("user:"+user+"pass"+pass);
		//AddService as = new AddService();
		//int k = as.add(i, j);
		ModelAndView mv = new ModelAndView();
		if(new CheckConnection().testConn(user, pass)){
			mv.setViewName("index");
			mv.addObject("message", "loginDone");
		}
		else{
			mv.setViewName("index");
			mv.addObject("message", "loginFailed");
		}
		
		return mv;
	}
}
