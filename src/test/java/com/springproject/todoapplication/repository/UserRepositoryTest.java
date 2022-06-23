package com.springproject.todoapplication.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springproject.todoapplication.entity.User;

@SpringBootTest
class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	void insertUser() {
		User user = new User();
		user.setUsername("user2");
		user.setPassword("123");
		user = userRepository.save(user);
		System.out.println(user);
	}
	

	@Test
	void printAllUsers() {
		List<User> users = userRepository.findAll();
		for (User user : users)
			System.out.println(user);
	}

}
