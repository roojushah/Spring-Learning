package com.Scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeOperation {

	public static void main(String[] args) {
		
		//	load Configration file
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("BeanScope.xml");
		
		//retrive the bean from spring container
		Student st = ac.getBean("student",Student.class);
		
		Student student = ac.getBean("student",Student.class);
		
		//check if they are same or not
		Boolean check = (st == student);
		
		System.out.println("Result of comparision==> " + check);
		
		//check memory location
		System.out.println("Memory location of 1st Student object==>" + st);
		
		System.out.println("Memory location of 2nd Student object==>" + student);
		
		ac.close();
	}
}
/*Prototype Result
Result of comparision==> false
Memory location of 1st Student object==>com.Scope.Student@473b46c3
Memory location of 2nd Student object==>com.Scope.Student@516be40f

Singleton Result
Result of comparision==> true
Memory location of 1st Student object==>com.Scope.Student@473b46c3
Memory location of 2nd Student object==>com.Scope.Student@473b46c3*/

