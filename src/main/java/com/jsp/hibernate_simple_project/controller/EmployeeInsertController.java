package com.jsp.hibernate_simple_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_simple_project.dto.Employee;

public class EmployeeInsertController {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		employee.setId(109);
		employee.setName("Kohli");
		employee.setAddress("Mumbai");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
		EntityManager entityManager  = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
		System.out.println("Data-Inserted");
	}
}
