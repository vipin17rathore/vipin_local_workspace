package annotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();
	}

}
