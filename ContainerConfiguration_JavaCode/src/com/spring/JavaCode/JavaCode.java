package com.spring.JavaCode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// In this approach, there is No need of XML file. 
public class JavaCode {

	public static void main(String[] args) {
		
		//	load Configration file
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(StudentConfig.class);
		
		//retrive the bean from spring container
		StudentConfig st = ac.getBean("studentConfig",StudentConfig.class);
		st.helloStudent();
		
		//retrive TennisCoach from container
		Coach c = ac.getBean("tennisCoach",Coach.class);
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getFortuneService());
		
		//close application context object
		ac.close();
	}
}