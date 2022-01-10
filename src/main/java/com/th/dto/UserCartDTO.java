package com.th.dto;

import com.th.model.Book;
import com.th.model.UserCart;

public class UserCartDTO {

	private Book book;
	private int quantity;


	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
