package com.sree.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortune = {"sacasfasd","rfgvewdfewd","wefweqwedw"};
	
	private Random random = new Random();
	
	@Override
	public String getDailyFortune() {
		int index = random.nextInt(fortune.length);
		return fortune[index];
	}

}
