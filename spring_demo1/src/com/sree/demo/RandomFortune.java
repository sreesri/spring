package com.sree.demo;

public class RandomFortune implements FortuneService {
	
	private String[] fortunes = {"fortune1","fortune2","fortune3"};
	
	public String getRandomFortune() {
		return fortunes[(int) (Math.random()/3)];
	}
	
	@Override
	public String getFortune() {
		return getRandomFortune();
	}

}
