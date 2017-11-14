package com.venky.springdemo;

public class Cricketcoach implements Coach {

	FortuneInter fort;
	
	public Cricketcoach() {
		super();
	
	}
	public Cricketcoach(FortuneInter fort) {
		
		this.fort = fort;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "5 hours undali ra ";
	}

	public String getFortune() {
		// TODO Auto-generated method stub
		return "neku telsa, "+fort.getFortune();
	}
	
	public void startStuff(){
		System.out.println("Inside Start Stuff");
	}
	public void destroyStuff(){
		System.out.println("Inside Destroy Stuff");
	}
	
	

}
