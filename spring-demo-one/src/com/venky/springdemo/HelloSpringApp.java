package com.venky.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach thecoach = (Coach) context.getBean("myCoach", Coach.class);
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getFortune());
		context.close();
		
	}

}
