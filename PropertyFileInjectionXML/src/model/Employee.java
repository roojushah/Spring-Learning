package model;

public class Employee {

	private String email;
	private String password;
	
	public Employee() {
		super();
	}
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		System.out.println("EMail Setter");
		this.email = email;
	}
	public void setPassword(String password) {
		System.out.println("Password Setter");
		this.password = password;
	}
	
}
