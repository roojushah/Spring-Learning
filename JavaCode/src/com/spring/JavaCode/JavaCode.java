package com.spring.JavaCode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCode {

	public static void main(String[] args) {
		
		//	load Configration file
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(StudentConfig.class);
		
		//retrive the bean from spring container
		StudentConfig st = ac.getBean("studentConfig",StudentConfig.class);
		st.helloStudent();
		
		//close application context object
		ac.close();
	}
}