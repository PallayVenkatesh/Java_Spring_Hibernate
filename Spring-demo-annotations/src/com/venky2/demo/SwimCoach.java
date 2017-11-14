package com.venky2.demo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortune;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService fr){
		this.fortune=fr;
	}
	
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "rooju 7ft pool lo dooku";
	}

	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

	public String getEmail() {
		return email;
	}


	public String getTeam() {
		return team;
	}

	

	
}
