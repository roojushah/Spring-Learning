package com.constructorXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Operation {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Annotations.xml");
		
		Coach coach = ac.getBean("myCoach" , Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortuneService());
		ac.close();
	}
}