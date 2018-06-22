package com.sree.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	//@Autowired
	private FortuneService fortuneService;
	
//	@Autowired
	/*public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice tennis daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
