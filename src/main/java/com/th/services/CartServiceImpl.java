package com.th.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.th.model.UserCart;
import com.th.repository.UserCartRepository;

@Service
public class CartServiceImpl implements CartService{
	
	
	@Autowired
	UserCartRepository userCartRepository;

	@Override
	public String addBookToCart(UserCart userCart) {
		
		UserCart  userscartSaved= userCartRepository.save(userCart);
		
		
		return "index";
	}

}
