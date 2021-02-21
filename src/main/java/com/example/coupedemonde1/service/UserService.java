package com.example.coupedemonde1.service;

import java.util.ArrayList;

import com.example.coupedemonde1.entities.User;

public interface UserService {
	
	public User getUserById(long id);

	public ArrayList<User> gatallusers();
	public void saveUser (User user ) ;
	
	public String deleteuser(long id);

}
