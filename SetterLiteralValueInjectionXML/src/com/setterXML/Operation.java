package com.setterXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Operation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Annotations.xml");
		
		//Email and Password property only exists in TennisCoach not in Coach so making 
		//use of TennisCoach instead of Coach interface
		TennisCoach coach = ac.getBean("myCoach" , TennisCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortuneService());
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getPassword());
		ac.close();
	}
}