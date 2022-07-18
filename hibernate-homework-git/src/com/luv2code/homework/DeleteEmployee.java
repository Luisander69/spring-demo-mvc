package com.luv2code.homework;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
	Session session = factory.getCurrentSession();
	try {
		
		int empId = 3;
		session = factory.getCurrentSession();
		session.beginTransaction();
		
		System.out.println("\nGetting employee with id: " + empId);
		Employee employee = session.get(Employee.class, empId);
		System.out.println("Deleting employee: \n" + employee);			
		session.delete(employee);
		
		/*System.out.println("Deleting employee id 3");
		session.createQuery("delete from Employee where id=3")
							.executeUpdate();*/
		session.getTransaction().commit();
		System.out.println("\nDone!");
	
	}finally {
	factory.close();
}
		

	}

}
