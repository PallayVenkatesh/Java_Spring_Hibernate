package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class DeleteInstructorDetailDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try{
			
			
			session.beginTransaction();
			int theId = 4;
			
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);
			
			System.out.println("tempInstructorDetail" +tempInstructorDetail);
			
			System.out.println("Associated Instructor is :"+tempInstructorDetail.getInstructor());
			
			
			tempInstructorDetail.getInstructor().setInstructorDetail(null);
			
			session.delete(tempInstructorDetail);
			
			session.getTransaction().commit();
			
			System.out.println("Done...! ");
		}
		finally{
			factory.close();
		}
		
		
	}

}
