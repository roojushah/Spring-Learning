package com.spring.JavaCode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.spring.JavaCode")
public class StudentConfig {

	private int rollNo;
	private String name;
	private int marks;
	
	public StudentConfig() {
		super();
	}
	
	@Bean // will expose the bean with name as method name :: happyFortuneService
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach tennisCoach() {
		return new TennisCoach(happyFortuneService()); // we are calling method who is exposing HappyFortuneSer
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	public void helloStudent()
	{
		System.out.println("Hi Student..I am here to help you...:)");
	}
}
