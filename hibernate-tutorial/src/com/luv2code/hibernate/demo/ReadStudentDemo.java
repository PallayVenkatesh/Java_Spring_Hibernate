package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try{
			
			session.beginTransaction();
			
			List<Student> theStudents = session.createQuery("from Student").list(); 
			
			displayStudents(theStudents);
			
			theStudents = session.createQuery("from Student s where s.lastName='pallay'").list();
			
			displayStudents(theStudents);
			
			theStudents = session.createQuery("from Student s where " +
					"s.lastName='pallay' or s.lastName='Wall1'").list();
			
			displayStudents(theStudents);
			
			theStudents = session.createQuery("from Student s where " +
					"s.lastName LIKE '%a%' ").list();
			
			displayStudents(theStudents);
			
			
			session.getTransaction().commit();
			
			System.out.println("Done...! ");
			
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("Update Student set lastName='pallllllay'").executeUpdate();
			System.out.println("Updated");
			
			session.getTransaction().commit();
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("Delete from Student  where id=1").executeUpdate();
			System.out.println("Deletedted");
			
			session.getTransaction().commit();
		
			System.out.println("Done oooo Donnnnuuu...! ");
		}
		finally{
			factory.close();
		}
		
		
	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

}
