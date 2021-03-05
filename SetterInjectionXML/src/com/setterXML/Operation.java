package com.setterXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Operation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Annotations.xml");
		
		TennisCoach coach = ac.getBean("myCoach" , TennisCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortuneService());
		ac.close();
	}
}