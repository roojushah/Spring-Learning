package model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertyInject {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(EmpConfig.class);
		Employee e = ac.getBean("employee" , Employee.class);
		System.out.println("Email is=> " + e.geEmail() + ", password is=>"  + e.getPassword());
		ac.close();
	}
}
