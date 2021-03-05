package com.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired 
	//@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		super();
		System.out.println("In TennisCoach Constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice for 8 hrs per day";
	}

	@Override
	public String getFortuneService() {
		return fortuneService.getFortuneService();
	}
}