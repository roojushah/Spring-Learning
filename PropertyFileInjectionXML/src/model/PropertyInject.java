package model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyInject {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = cs.getBean("employee" , Employee.class);
		System.out.println("Email is=> " + e.getEmail() + ", password is=>"  + e.getPassword());
	}
}
