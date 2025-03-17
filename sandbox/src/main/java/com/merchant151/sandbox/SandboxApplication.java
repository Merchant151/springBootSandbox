package com.merchant151.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class SandboxApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SandboxApplication.class, args);
		DependencyInjectionExample firstLocation = new DependencyInjectionExample(new offlineLocation());
		firstLocation.runAPI();
		DependencyInjectionExample secondLocation = new DependencyInjectionExample(new secondLocation());
		secondLocation.runAPI();
	}

}
