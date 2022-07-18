package com.luv2code.homework;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class QueryEmpoyee {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
	Session session = factory.getCurrentSession();
	try {
		
		session.beginTransaction();
		List<Employee> theEmployees = session.createQuery("from Employee").getResultList();
		displayStudents(theEmployees);
		
		theEmployees = session.createQuery("from Employee s where s.company='Disney'").getResultList();
		System.out.println("\nEmployees who work for Disney\n");
		displayStudents(theEmployees);
		
			
		session.getTransaction().commit();
		
		System.out.println("\nDone!");
		
	}finally {
		factory.close();
	}
		

	}
	private static void displayStudents(List<Employee> theEmployees) {
		for(Employee temp : theEmployees) {
			System.out.println(temp);
		}

	}
}
