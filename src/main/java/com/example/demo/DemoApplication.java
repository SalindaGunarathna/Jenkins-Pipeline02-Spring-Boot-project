package com.example.demo;

import com.example.demo.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("pipeline 02");

		User user = new User("salinda", "password", "admin");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getRole());
		SpringApplication.run(DemoApplication.class, args);
	}

}
