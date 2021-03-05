package com.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		System.out.println("Parameterized constructor called");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice for 8 hrs per day!!!!";
	}

	@Override
	public String getFortuneService() {
		return fortuneService.getFortuneService();
	}
}
