package com.sree.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "u have a gud day";
	}

}
