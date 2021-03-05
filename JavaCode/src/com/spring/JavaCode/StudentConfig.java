package com.spring.JavaCode;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.JavaCode")
public class StudentConfig {

	private int rollNo;
	private String name;
	private int marks;
	
	public StudentConfig() {
		super();
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
