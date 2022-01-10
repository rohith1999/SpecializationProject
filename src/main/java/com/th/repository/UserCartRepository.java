package com.th.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.th.model.UserCart;

@Repository
public interface UserCartRepository extends JpaRepository<UserCart,Integer> {
	
	List<UserCart> findByUseremail(String useremail);
	UserCart findByUseremailAndBookid(String useremail, int bookid);
	

}
