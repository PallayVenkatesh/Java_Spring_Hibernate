package com.venky2.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach ch = context.getBean("tennisCoach", Coach.class);
		Coach ch2 = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (ch==ch2);
		System.out.println(result);
		System.out.println(ch);
		System.out.println(ch2 );
	}

}
