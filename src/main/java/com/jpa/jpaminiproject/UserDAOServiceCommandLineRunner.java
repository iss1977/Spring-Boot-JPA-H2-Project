package com.jpa.jpaminiproject;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.jpaminiproject.entity.User;
import com.jpa.jpaminiproject.entity.service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

	@Autowired
	private UserDAOService userDAOService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Jack","Admin");
		long insertedId = userDAOService.insert(user);
		logger.info("New User was created ID:"+user.getId()+" ,Name: "+user.getName());
		
		
	}

}
