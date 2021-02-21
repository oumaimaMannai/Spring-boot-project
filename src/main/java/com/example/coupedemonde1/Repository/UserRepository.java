package com.example.coupedemonde1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.coupedemonde1.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{


	public User findUserById(long id);

}
