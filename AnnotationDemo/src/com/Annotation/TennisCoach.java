package com.Annotation;

import org.springframework.stereotype.Component;

/*@Component("Tenniscoach") ==> for explicitly giving name*/
@Component //for default bean id name
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practise atleast for 1 hour";
	}

}
