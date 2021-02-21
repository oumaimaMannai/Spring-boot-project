package com.example.coupedemonde1.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.coupedemonde1.Repository.UserRepository;
import com.example.coupedemonde1.entities.User;
import com.example.coupedemonde1.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService{
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUserById(long id) {
		return userRepository.findUserById(id);

	}
	
	public ArrayList<User> getallusers() {

		ArrayList<User> users = (ArrayList<User>) userRepository.findAll();
		return users;
	}
	
@Override	
public void saveUser(User signUpRequest) {
		// Creating user's account 
	// why you try to find the user ?!?
				User user = new User();
				user.setId(signUpRequest.getId());
				user.setNom(signUpRequest.getNom());
				user.setPrenom(signUpRequest.getPrenom());
				user.setPassword(signUpRequest.getPassword());
				user.setEmail(signUpRequest.getEmail());
				userRepository.save(user);
		userRepository.save(user);
	}

@Override
public String deleteuser(long id) {

	userRepository.deleteById(id);
	return "200 ok";
}

@Override
public ArrayList<User> gatallusers() {
	// TODO Auto-generated method stub
	return null;
}


}
