package com.th.services;

import com.th.model.Admin;

public interface AdminService {
	
	/**
	 * findByUserEmail (finds a admin user using his email id) 
	 * @param admin
	 * @return
	 */
	public String findByAdminId(Admin admin);

}
