package com.it.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.springboot.daodto.IUserlistDao;

@Service
public abstract class BService implements IService{

	@Autowired
	private IUserlistDao dao;
	
	
}
