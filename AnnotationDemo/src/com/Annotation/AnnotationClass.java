package com.Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Annotations.xml");
		
		TennisCoach tc = ac.getBean("tennisCoach" , TennisCoach.class);
		System.out.println(tc.getDailyWorkout());
		ac.close();
	}

}
