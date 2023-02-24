package com.jsp.hibernate_simple_project.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_simple_project.dto.Employee;

public class EmployeeDisplayController {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//JPQL(Java Persistence Query Language)
		
		String select = "Select e From Employee e";
		
		Query query=entityManager.createQuery(select);
		
		List<Employee> employees=query.getResultList();
		
		for (Employee employee : employees) {
			
			System.out.println(employee.getId()+"\n"+employee.getName()+"\n"+employee.getAddress());
			System.out.println("..................................................");
		}
		
	}
}
