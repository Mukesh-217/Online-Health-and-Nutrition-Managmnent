package com.klef.jfsd.service;

import com.klef.jfsd.model.Admin;
import com.klef.jfsd.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminImplementation implements AdminService{
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin checkadminlogin(String uname, String pwd) {
		return adminRepository.checkadminlogin(uname, pwd);
	}

}
