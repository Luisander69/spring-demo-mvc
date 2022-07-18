package com.luv2code.homework;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class ReadEmployee {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
	Session session = factory.getCurrentSession();
	try {
		int reqId = 1;
		System.out.println("Employee's id: "+reqId);
		
		session.beginTransaction();
		System.out.println("\nGetting employee with id: " + reqId);
		Employee employee = session.get(Employee.class, reqId);
		System.out.println("Get complete: " + employee);
		session.getTransaction().commit();
		
		System.out.println("Done!");
		
	}finally {
		session.close();
	}
	}

}


