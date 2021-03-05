package com.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired //Here it will search for the Class and it will
				//inject the dependency by REFLECTION in this.
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

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In setFortuneService");
		this.fortuneService = fortuneService;
	}
	
}