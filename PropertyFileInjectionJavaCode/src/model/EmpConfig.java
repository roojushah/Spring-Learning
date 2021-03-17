package model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.spring.JavaCode")
@PropertySource("classpath:emp.properties")
public class EmpConfig {
	
	public EmpConfig() {
		super();
	}
	
	@Bean
	public Employee employee() {
		return new Employee();
	}

	public void helloStudent()
	{
		System.out.println("Hi Student..I am here to help you...:)");
	}
}
