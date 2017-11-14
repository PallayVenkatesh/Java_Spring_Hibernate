package com.venky.springdemo;

public class SoccerCoach implements Coach {

	private FortuneInter fi;
	private String team;
	private String email;
	
	public SoccerCoach(){
		System.out.println("we are inside constructor");
	}
	
	public String getTeam() {
		
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside Team setter");
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Inside email setter");
		this.email = email;
	}


	 
	public void setFi(FortuneInter fi) {
		System.out.println("Inside fi setter");
		this.fi = fi;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "pichi sport ra edhi";
	}

	public String getFortune() {
		// TODO Auto-generated method stub
		return fi.getFortune();
	}

}
