package com.chase.ipm.appjobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.chase.ipm.appjobs.entity")
public class IpmAppjobsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpmAppjobsApplication.class, args);
	}

}
