package com.sree.demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		//System.out.println("jsvnksdmcsdklvknvn");
	}
	
	public TrackCoach(FortuneService fortuneService) {
		//System.out.println("ojbndmcfvdokdaslksdkng");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "scxcxs"+fortuneService.getFortune();
	}

}
