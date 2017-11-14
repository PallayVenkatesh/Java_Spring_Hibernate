package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

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
			Student tempStudent1 = new Student("Paul1","Wall1","paul1@luv2code.com");
			Student tempStudent2 = new Student("Paul2","Wall2","paul2@luv2code.com");
			Student tempStudent3 = new Student("Paul3","Wall3","paul3@luv2code.com");
			session.beginTransaction();
			System.out.println("Saving student....");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			session.getTransaction().commit();
			System.out.println("Done...! ");
		}
		finally{
			factory.close();
		}



	}

}
