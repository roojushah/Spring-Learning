package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int rollNo;
	private String name;
	private int marks;
	
	public Student() {
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

	///user methods
	@PostConstruct
	public void myInitMethod()
	{
		System.out.println("Student : Inside MyInit Method");
	}
	
	@PreDestroy
	public void myDestroyMethod()
	{
		System.out.println("Student : Inside myDestroyMethod Method");
	}
	
	public void helloStudent()
	{
		System.out.println("Hi Student..I am here to help you...:)");
	}
}
