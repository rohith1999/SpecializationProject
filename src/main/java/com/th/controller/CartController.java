package com.th.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.th.constants.PropertyConstant;
import com.th.model.Book;
import com.th.model.UserCart;
import com.th.repository.BookRepository;
import com.th.repository.UserCartRepository;
import com.th.services.CartService;

/**
 * This class allows you to add, delete, get and find a book by id in a user's cart
 * @author Rohith S
 *
 */
@Controller
@RequestMapping(PropertyConstant.CART)
public class CartController {
	
	
	@Autowired
	CartService cartService;

	
	/**
	 * getAllBooksFromCart displays all books to the user under cart
	 * @return ResponseEntity<List<Book>> returns a list of books
	 */
//	@GetMapping(PropertyConstant.GET_ALL_BOOKS)
//	public  ResponseEntity<List<Book>> getAllBooksFromCart(){
//		
//		List<Book> blist = bookRepository.findAll();
//		return new ResponseEntity<List<Book>>(blist,HttpStatus.OK);
//	}
	
	/**
	 * addBookToCart adds a book to the respective user's cart
	 * @param userCart adds a book to the UserCart table
	 * @return  shows the details of the book that was added to the cart
	 */
	@PostMapping(PropertyConstant.BOOK)
	public String addBookToCart(UserCart userCart){
		
		return cartService.addBookToCart(userCart);
	}
	
	/** 
	 * deleteBookById deletes a book from the user's cart
	 * @param bookId unique ID of the book
	 * @return ResponseEntity<Book> no content else returns not found 
	 */
//	@DeleteMapping(PropertyConstant.DELETE_BOOK)
//	public ResponseEntity<UserCart> deleteBookById(@PathVariable int bookId){
//		
//		if(userCartRepository.existsById(bookId)) {
//			userCartRepository.deleteById(bookId);
//			return new ResponseEntity<UserCart>(HttpStatus.NO_CONTENT);
//		}
//			return new ResponseEntity<UserCart>(HttpStatus.NOT_FOUND);
//			
//	}
	
	
	

}
