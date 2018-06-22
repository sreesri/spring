package com.sree.demo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "databse service";
	}

}
