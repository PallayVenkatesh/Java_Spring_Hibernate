package com.venky.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SoccerCoach ch = (SoccerCoach) context.getBean("socc", SoccerCoach.class);
		System.out.println(ch.getFortune());
		System.out.println(ch.getDailyWorkout());
		System.out.println(ch.getEmail());
		System.out.println(ch.getTeam());
		context.close();
		
		
	}

}
