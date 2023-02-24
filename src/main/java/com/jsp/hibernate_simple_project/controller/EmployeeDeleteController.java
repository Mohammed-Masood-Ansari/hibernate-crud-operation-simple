package com.jsp.hibernate_simple_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_simple_project.dto.Employee;

public class EmployeeDeleteController {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		//select * from employee where id = 107;
		Employee employee = entityManager.find(Employee.class, 107);
		
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
		
		System.out.println("Data-Deleted");
	}
}
