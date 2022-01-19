package com.th.constants;

/**
 * PropertyConstant (API end point constants are defined)
 * 
 * @author Rohith S
 *
 */
public class PropertyConstant {
	/**
	 * AUTH_USER (path URI to authenticates a admin user) 
	 */
	public static final String AUTH_USER = "/auth";
	
	/**
	 * REGISTER_USER (path URI to registers a new user onto the application)
	 */
	public static final String REGISTER_USER = "/register";
	
	/**
	 *  BOOKS (path URI allows book CRUD operation to be performed) 
	 */
	public static final String BOOKS = "/books";
	
	/**
	 * BOOK (path URI that adds a book into the book table)
	 */
	public static final String BOOK = "/book";
	
	/**
	 * GET_ALL_BOOKS (path URI that gets all books from the sql database)
	 */
	public static final String GET_ALL_BOOKS = "/getallbooks";
	
	/**
	 * FIND_BOOK (path URI that finds a book using the bookId)
	 */
	public static final String FIND_BOOK = "/getbookbyid/{bookId}";
	
	/**
	 * DELETE_BOOK (path URI that deletes a book using bookId)
	 */
	public static final String DELETE_BOOK = "/deletebook/{bookId}";
	
	/**
	 * CART (path URI that performs cart operations)
	 */
	public static final String CART = "/cart";
	
	/**
	 * DEFAULT (Path URI that returns index page)
	 */
	public static final String DEFAULT = "/";
	
	/**
	 * USER_LOGIN (path URI to authenticates a user) 
	 */
	public static final String USER_LOGIN = "/userlogin";
	/**
	 * USER_REGISTER (path URI to registers a new user onto the application)
	 */
	public static final String USER_REGISTER = "/userregister";
	
	/**
	 * USER_PASS_CHANGE (path URI to change a existing users password)
	 */
	public static final String USER_PASS_CHANGE = "/passwordchange";
	
	/**
	 * ADMIN_DELETE deletes a book from MYSQLDB
	 */
	public static final String ADMIN_DELETE = "/admin/delete";
	
	/**
	 * ADMIN_UPDATE updates a book in MYSQLDB
	 */
	public static final String ADMIN_UPDATE = "/admin/update";
	
	/**
	 * ADMIN_ADD adds a new book to MYSQLDB 
	 */
	public static final String ADMIN_ADD = "/admin/addbook";
	
	
	/**
	 * USER_DISPLAY_CART displays books added to cart by user
	 */
	public static final String  USER_DISPLAY_CART = "/orders/{useremail}";
	
	/**
	 * USER_ADD_TO_CART adds a book to user's cart
	 */
	public static final String USER_ADD_TO_CART = "/cartaddbook";
	
	/**
	 * USER_DELETE_CART delete a book to from cart
	 */
	public static final String USER_DELETE_CART = "/deletebookcart";
	
	/**
	 * SEARCH search book
	 */
	public static final String SEARCH = "/search";

}
