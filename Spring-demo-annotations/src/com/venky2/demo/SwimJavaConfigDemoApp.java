package com.venky2.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach ch = context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(ch.getDailyWorkout());
		System.out.println(ch.getFortune());
		System.out.println(ch.getEmail());
		System.out.println(ch.getTeam());
		
		context.close();
		
		
	}

}
