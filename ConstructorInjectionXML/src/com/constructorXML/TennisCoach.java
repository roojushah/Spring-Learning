package com.constructorXML;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach() {
		super();
		System.out.println("No-arg constructor");
	}
	
	public TennisCoach(FortuneService fortuneService) {
		super();
		System.out.println("Parameterized constructor");
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
