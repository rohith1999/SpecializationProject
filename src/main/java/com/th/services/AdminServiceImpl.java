package com.th.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.th.model.Admin;
import com.th.repository.AdminRepository;

/**
 * 
 * UserServiceImpl implements the business logic for registering and
 * authenticating a user
 * 
 * @author Rohith S
 *
 */
@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;

	@Override
	public String findByAdminId(Admin admin) {

		Optional<Admin> searchAdminUser = adminRepository.findById(admin.getAdminid());
		if (searchAdminUser.isPresent()) {
			Admin adminUser = searchAdminUser.get();
			if (admin.getAdminpassword().equals(adminUser.getAdminpassword())) {
				// TODO change redirect page	
				return "home";
			} else {

				return "index";
			}

		} else
			return "invalid";

	}

}
