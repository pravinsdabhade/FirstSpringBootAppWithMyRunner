package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	Employee emp;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From My Runner1..");
		System.out.println("Employee Id: "+emp.getId());
	}

}
