package com.th.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.th.model.UserCart;

@Repository
public interface UserCartRepository extends JpaRepository<UserCart,Integer> {
	
	

}
