package com.th.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Boot Configuration provides beans to be configured at runtime
 * @author Rohith S
 *
 */
@Configuration
public class BootConfiguration {
	
	/**
	 * Used to Encrypt password using Bcrypt algorithm
	 * @return {@link PasswordEncoder} which helps to decrypt, encrypt and match a password 
	 */
	@Bean	
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}

}
