package com.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleOperation {

	public static void main(String[] args) {
		
		//	load Configration file
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("BeanLifecycle.xml");
		
		//retrive the bean from spring container
		Student st = ac.getBean("student",Student.class);
		st.helloStudent();
		
		//close application context object
		ac.close();
	}
}