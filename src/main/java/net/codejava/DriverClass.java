package net.codejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DriverClass {

	public static void main(String[] args) {
		SpringApplication.run(DriverClass.class, args);
		System.out.println("Hello");
	}
}
