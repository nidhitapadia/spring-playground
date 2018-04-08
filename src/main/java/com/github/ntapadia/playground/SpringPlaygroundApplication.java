package com.github.ntapadia.playground;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringPlaygroundApplication {

	public static void main(String[] args) {
		log.info("Starting application");
		SpringApplication.run(SpringPlaygroundApplication.class, args);
	}
}
