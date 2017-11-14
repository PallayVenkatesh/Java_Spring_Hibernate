package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try{
			System.out.println("creating new Student object.....");
			Student tempStudent = new Student("Paul","Wall","paul@luv2code.com");
			session.beginTransaction();
			System.out.println("Saving student....");
			session.save(tempStudent);
			session.getTransaction().commit();
			System.out.println("Done...! ");
		}
		finally{
			factory.close();
		}
		
		
	}

}
