package com.venky2.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component

public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomService")
	private FortuneService fs;
	public TennisCoach(){
		System.out.println("Insite Constructor ");
	}
	
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println(">> indside startup");
	}
	
	@PreDestroy
	public void doMyStartupStuff(){
		System.out.println(">> indside startup");
	}
//	@Autowired
//	public void crazy(FortuneService fs) {
//		System.out.println("Inside Crazy Tennis method");
//		this.fs = fs;
//	}

	//	@Autowired
//	public TennisCoach(FortuneService thefs){
//		this.fs = thefs;
//	}
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Amaila aata ra edhi";
	}

   	public String getFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}

}
