/**
 * 
 */
package com.example.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author p.dabhade
 *
 */
@Component
public class MyRunnerInAnotherPackage implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("My Runner class...");
	}

}
