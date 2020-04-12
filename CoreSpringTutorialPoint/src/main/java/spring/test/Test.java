package spring.test;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

		// Resource rc = new ClassPathResource("applicationContext.xml");
//		  BeanFactory beanFactory = new XmlBeanFactory(rc);
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

	/*	Employee st = (Employee) ac.getBean("e");
		st.show();
*/
		
		Teacher t = (Teacher) ac.getBean("t1");
		t.display();
	}

}
