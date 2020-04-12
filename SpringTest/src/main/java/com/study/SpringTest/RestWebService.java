package com.study.SpringTest;

import java.util.ArrayList;




import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.dao.Teacher;
@RestController
public class RestWebService {
	/* For all the teacher details */
	@RequestMapping(value = "/teacherList",method=RequestMethod.GET )
	public ArrayList<Teacher> getTeacherList() {

		ArrayList<Teacher> arList = new ArrayList<Teacher>();
		Teacher th1 = new Teacher();
		th1.setThName("Vipin");
		
		Teacher th2 = new Teacher();
		th2.setThName("Rahul");
		
		Teacher th3 = new Teacher();
		th3.setThName("Abhishek");

		arList.add(th1);
		arList.add(th2);
		arList.add(th3);
		return arList;
	}

	/* For Single record */
	@RequestMapping(value = "/teacherList/{name}", method = RequestMethod.GET)
	public Teacher getDetails(@PathVariable("name") String name) {
		Teacher th = new Teacher();
		th.setThName(name);
		th.setThMobileNo(9806);
		return th;
	}
  }
