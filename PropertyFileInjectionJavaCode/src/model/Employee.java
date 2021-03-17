package model;

import org.springframework.beans.factory.annotation.Value;

public class Employee {

	@Value("${rooju.empEmail}")
	private String email;
	
	@Value("${rooju.empPassword}")
	private String password;
	
	public Employee() {
		super();
	}
	
	public String geEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
}
