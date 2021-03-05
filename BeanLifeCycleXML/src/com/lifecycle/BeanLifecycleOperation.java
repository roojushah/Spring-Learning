package com.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleOperation {

	public static void main(String[] args) {
		
		//	load Configration file
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("BeanLifecycle.xml");
		
		//retrive the bean from spring container
		Student st = ac.getBean("student",Student.class);
		st.helloStudent();
		
		//close application context object
		ac.close();
	}
}
//Output for singleton scope
//INFO: Loading XML bean definitions from class path resource [BeanLifecycle.xml]
//No Arg constructor
//Setter:Roll No
//Setter:Name
//Setter:Marks
//Student : Inside MyInit Method
//Hi Student..I am here to help you...:)
//Dec 30, 2020 4:30:15 PM org.springframework.context.support.AbstractApplicationContext doClose
//INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@1a93a7ca: startup date [Wed Dec 30 16:30:15 IST 2020]; root of context hierarchy
//Student : Inside myDestroyMethod Method

//Output for Prototype scope
//INFO: Loading XML bean definitions from class path resource [BeanLifecycle.xml]
//No Arg constructor
//Setter:Roll No
//Setter:Name
//Setter:Marks
//Student : Inside MyInit Method
//Hi Student..I am here to help you...:)
//Dec 30, 2020 4:40:21 PM org.springframework.context.support.AbstractApplicationContext doClose
//INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@1a93a7ca: startup date [Wed Dec 30 16:40:18 IST 2020]; root of context hierarchy
