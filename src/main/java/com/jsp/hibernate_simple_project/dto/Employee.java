package com.jsp.hibernate_simple_project.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

//this is entity/pojo/bean/fully encapsulated class
@Entity
public class Employee {

	@Id
	private int id;
	private String name;
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
