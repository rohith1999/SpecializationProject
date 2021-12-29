package com.th;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * BookStoreApplication class helps in running the application
 * 
 * @author Rohith s
 *
 */
@EnableAutoConfiguration
@EnableWebMvc
@Configuration
@ComponentScan
@SpringBootApplication
public class BookStoreApplication extends SpringBootServletInitializer {

	/**
	 * This main method is the starting point of the application
	 * 
	 * @param args Accepts command line input in the form of array
	 */
	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

}
