package com.th.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.th.constants.PropertyConstant;
import com.th.dto.UserCartDTO;
import com.th.model.UserCart;
import com.th.services.CartService;

/**
 * This class allows you to add, delete, get books in a user's
 * cart
 * 
 * @author Rohith S
 *
 */
@Controller
public class CartController {

	/**
	 * cartService (autowires all user's cart functionalitites to cart controller)
	 */
	@Autowired
	CartService cartService;



	/**
	 * addBookToCart adds a book to the respective user's cart
	 * 
	 * @param userCart adds a book to the UserCart table
	 * @return shows the details of the book that was added to the cart
	 */
	@PostMapping(PropertyConstant.USER_ADD_TO_CART)
	public String addBookToCart(UserCart userCart) {

		return cartService.addBookToCart(userCart);
	}



	/**
	 * displays all orders made by the logged in user 
	 * @param useremail 
	 * @param model (allows to add the book object to be displayed onto the UI)
	 * @return String (returns cart page or Invalid page)
	 */
	@GetMapping(PropertyConstant.USER_DISPLAY_CART)
	public String getAllOrders(@PathVariable String useremail, Model model) {
		return cartService.getAllOrders(useremail,model);

	}
	
	/**
	 * delete a book from cart
	 * @param userCartDTO
	 * @return String (returns cart page or Invalid page)
	 */
	@PostMapping(PropertyConstant.USER_DELETE_CART)
	public String deleteBookCart(UserCartDTO userCartDTO) {
		return cartService.deleteBookCart(userCartDTO.getCartid());
	}
	
	
}
