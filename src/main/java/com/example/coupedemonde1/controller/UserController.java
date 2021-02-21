package com.example.coupedemonde1.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.coupedemonde1.entities.User;
import com.example.coupedemonde1.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@RequestMapping(method = RequestMethod.GET, value = { "/userbyId/{id}" } )
	public User getUserById(@PathVariable long id) {
		return userService.getUserById(id);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = { "/getusers" } )
	public ArrayList<User> getallusers() {
		return userService.gatallusers();
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = { "/adduser" } )
	public void saveUser(@RequestBody User user) {
	  userService.saveUser(user);
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE, value = { "/deleteUser/{id}" })
	public String deleteuser(@PathVariable long id) {
		 userService.deleteuser(id);
		 return"200 ok";
	}

}
