package com.sree.demo;

public class CricketCoach implements Coach {
	
	private String email;
	private String team;
	private FortuneService  foretuneservice;
	
	public void setForetuneservice(FortuneService foretuneservice) {
		this.foretuneservice = foretuneservice;
	}
		
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("called cricket coach");
	}

	@Override
	public String getDailyWorkout() {
		return "get ur ass out and play cricket";
	}

	@Override
	public String getDailyFortune() {
		return foretuneservice.getFortune();
	}

}
