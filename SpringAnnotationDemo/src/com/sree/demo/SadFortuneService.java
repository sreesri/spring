package com.sree.demo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "its a sad day";
	}

}
