package com.g18.sla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SlaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlaApplication.class, args);
	}

}
