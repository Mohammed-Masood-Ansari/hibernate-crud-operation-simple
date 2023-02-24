package com.jsp.hibernate_simple_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_simple_project.dto.Employee;

public class EmployeeUpdateController {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		//select * from employee where id = 107;
		Employee employee = entityManager.find(Employee.class, 107);
		
		employee.setAddress("Mumbai");
		
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		
		System.out.println("Data-Updated");
		
		System.out.println("id = "+employee.getId());
		System.out.println("Name = "+employee.getName());
		System.out.println("Address = "+employee.getAddress());
		
		
	}
}
