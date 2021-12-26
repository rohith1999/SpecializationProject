package com.th.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.th.model.Userscart;

@Repository
public interface UsersCartRepository extends JpaRepository<Userscart,Integer> {
	
	

}
