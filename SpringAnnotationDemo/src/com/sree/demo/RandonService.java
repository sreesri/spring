package com.sree.demo;

import org.springframework.stereotype.Component;

@Component
public class RandonService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "random fortune";
	}

}
