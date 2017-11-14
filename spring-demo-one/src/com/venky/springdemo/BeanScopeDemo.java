package com.venky.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach ch = (Coach) context.getBean("myCoach",Coach.class);
		Coach ch2 = (Coach) context.getBean("myCoach",Coach.class); 
		boolean result=(ch==ch2);
		System.out.println("is it pointing to same Object: "+result);
		System.out.println("memory loc of ch: "+ch);
		System.out.println("memory loc of ch2: "+ch2+"\n");
		context.close();
	}

}
