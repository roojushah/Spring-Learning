package com.constructor;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		return "Today is my lucky day DB";
	}
}
