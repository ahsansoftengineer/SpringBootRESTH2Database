package com.springboot.telesko.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MVCApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(MVCApplication.class, args);
//		ConfigurableApplicationContext context =  SpringApplication.run(TeleskoSpringBootApplication.class, args);
//		// Spring Boot is providing Single Instance by default
//		Alien alien = context.getBean(Alien.class); // Laptop is provided in Alien class with @Autowired
//
//		System.out.println(alien.getLaptop().toString());
	}
}
