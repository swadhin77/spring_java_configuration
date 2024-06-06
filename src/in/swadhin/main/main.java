package in.swadhin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.swadhin.bean.student;
import in.swadhin.configuraton.java_config;

public class main {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(java_config.class);
//		student s=(student)ac.getBean("servletdemo");
//		s.display();
		student std=ac.getBean(student.class);
		std.display();
	}

}
