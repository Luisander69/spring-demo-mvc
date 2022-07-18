package com.luv2code.homework;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateEmployee {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Employee.class)
					.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			System.out.println("Creating a new employee...");
			//Employee employee = new Employee("Zack","Snyder","WB");
			//Employee employee1 = new Employee("JJ","Abrahams","Disney");
			Employee employee2 = new Employee("Sam","Raymey","Sony");
			session.beginTransaction();
			System.out.println("Saving the employee...");
			session.save(employee2);
			session.getTransaction().commit();
			System.out.println("Done!");
			
		}finally {
			session.close();
		}
		
		
	}
}
