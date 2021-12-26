package com.th.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.th.model.Users;

public interface UsersRepository extends JpaRepository<Users,String> {

}
