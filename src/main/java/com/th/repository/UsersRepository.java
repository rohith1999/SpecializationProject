package com.th.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.th.model.User;

public interface UsersRepository extends JpaRepository<User,String> {

}
