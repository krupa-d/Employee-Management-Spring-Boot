package com.sakha.Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SakhaBootManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SakhaBootManagementApplication.class, args);
	}

}
