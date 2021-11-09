package com.sparta.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

}
