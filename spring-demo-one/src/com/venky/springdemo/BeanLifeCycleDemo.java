package com.venky.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach ch = (Coach) context.getBean("myCoach",Coach.class);
		 
		
		System.out.println(ch.getDailyWorkout());
		System.out.println(ch.getFortune());
		context.close();
	}

}
