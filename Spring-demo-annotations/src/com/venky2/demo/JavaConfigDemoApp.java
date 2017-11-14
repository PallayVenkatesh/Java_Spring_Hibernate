package com.venky2.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach ch = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(ch.getDailyWorkout());
		System.out.println(ch.getFortune());
		context.close();
		
		
	}

}
