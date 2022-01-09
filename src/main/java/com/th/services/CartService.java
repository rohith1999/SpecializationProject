package com.th.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.th.model.UserCart;

/**
 * 
 * @author Rohith S
 *
 */
public interface CartService {
	
	
	public String addBookToCart(UserCart userCart);
		
		
	

	

}
