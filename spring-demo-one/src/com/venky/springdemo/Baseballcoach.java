 package com.venky.springdemo;

public class Baseballcoach implements Coach {

	/**
	 * @param args
	 */
	private FortuneInter fortune;
	public Baseballcoach(FortuneInter thefortune){
		this.fortune = thefortune;
	}


	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 min on ground";
	}

	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
