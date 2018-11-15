package com.oasystem;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages={"com.oasystem.pojo"})
//@EnableJpaRepositories(basePackages = { "com.oasystem.pojo"})
//@SpringBootApplication
public class OasystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OasystemApplication.class, args);
	}
}
