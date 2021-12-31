package com.th.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.th.model.Book;

public interface BookPaginationRepository extends PagingAndSortingRepository<Book, Integer> {
	List<Book> findAllByRecentlyAdded(double price, Pageable pageable);
}



    
