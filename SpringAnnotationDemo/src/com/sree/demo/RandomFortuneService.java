package com.sree.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class RandomFortuneService implements FortuneService {
	
	@Value("${email}")
	String email;
	
	@Value("${a}")
	String a;
	
	private String[] fortune = {"sdfsdf","sdfsdfsdff","erwedfasd"};

	private Random random = new Random();
	
	@Override
	public String getDailyFortune() {
		System.out.println(email + a);
		int index = random.nextInt(fortune.length);
		return fortune[index];
	}

}
