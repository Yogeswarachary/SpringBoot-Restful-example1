package com.springbootrestful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
public class SpringBootRestfulExample1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulExample1Application.class, args);
	}

}
