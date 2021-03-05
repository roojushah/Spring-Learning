package com.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		super();
		System.out.println("In TennisCoach Constructor");
	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In setter method...");
		this.fortuneService = fortuneService;
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
