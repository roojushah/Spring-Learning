package com.spring.JavaCode;

import org.springframework.stereotype.Component;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		return "Today is my lucky day";
	}

}
