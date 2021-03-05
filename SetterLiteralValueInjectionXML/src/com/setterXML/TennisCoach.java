package com.setterXML;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String password;
	
	public TennisCoach() {
		super();
		System.out.println("No-arg constructor");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Setter method of Email address from Tennis coach");
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("Setter method of password from Tennis coach");
		this.password = password;
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
