package com.venky2.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach ch = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(ch.getDailyWorkout());
		System.out.println(ch.getFortune());
		context.close();
		
		
	}

}
