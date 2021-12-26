package com.th.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.th.model.Book;
import com.th.model.Userscart;
import com.th.repository.BookRepository;
import com.th.repository.UsersCartRepository;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	UsersCartRepository jpc;
	@Autowired
	BookRepository jpb;
	
	
	//display all books for user
	
	@GetMapping("/getAllBooks")
	public  ResponseEntity<List<Book>> getAllBooks(){
		
		List<Book> blist = jpb.findAll();
		return new ResponseEntity<List<Book>>(blist,HttpStatus.OK);
	}
	
	//add a book to his cart
	
	@PostMapping("/book")
	public ResponseEntity<Userscart> save (@RequestBody Userscart b){
		Userscart bk = jpc.save(b);
		return new ResponseEntity<Userscart>(bk,HttpStatus.OK);
	}
	
	//remove a book from his cart 
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Userscart> deleteBookById(@PathVariable int id){
		if(jpc.existsById(id)) {
			jpc.deleteById(id);
			return new ResponseEntity<Userscart>(HttpStatus.NO_CONTENT);
		}
			return new ResponseEntity<Userscart>(HttpStatus.NOT_FOUND);
	}
	
	
	

}
