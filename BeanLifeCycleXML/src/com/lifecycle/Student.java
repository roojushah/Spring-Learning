package com.lifecycle;

public class Student {

	private int rollNo;
	private String name;
	private int marks;
	
	public Student() {
		super();
		System.out.println("No Arg constructor");
	}

	public void setRollNo(int rollNo) {
		System.out.println("Setter:Roll No");
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		System.out.println("Setter:Name");
		this.name = name;
	}

	public void setMarks(int marks) {
		System.out.println("Setter:Marks");
		this.marks = marks;
	}

	///user methods
	public void myInitMethod()
	{
		System.out.println("Student : Inside MyInit Method");
	}
	
	public void myDestroyMethod()
	{
		System.out.println("Student : Inside myDestroyMethod Method");
	}
	
	public void helloStudent()
	{
		System.out.println("Hi Student..I am here to help you...:)");
	}
}
