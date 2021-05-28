package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	
//	@Value("emp")		java.lang.NumberFormatException: For input string: "emp"
	@Value("2313")
	private Integer id;

	public Employee() {
	}
	
	public Employee(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}
	
}
