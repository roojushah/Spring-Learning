package com.setterXML;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach() {
		super();
		System.out.println("No-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter method of Fortune Service from Tennis coach");
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
