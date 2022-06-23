package com.springproject.todoapplication.repository;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springproject.todoapplication.entity.Todo;
import com.springproject.todoapplication.entity.User;

@SpringBootTest
class TodoRepositoryTest {
	
	@Autowired
	private TodoRepository todoRepository;

	@Test
	void insertTodo() {
		User user = new User();
		user.setUserId(5L);
		user.setUsername("user1");
		user.setPassword("123");
		
		Todo todo = new Todo();
		todo.setDescription("Learn to Code");
		todo.setTargetDate(new Date());
		todo.setIsComplete(false);
		todo.setUser(user);		
		todoRepository.save(todo);
		
		todo = new Todo();
		todo.setDescription("Learn to Dance");
		todo.setTargetDate(new Date());
		todo.setIsComplete(false);
		todo.setUser(user);		
		todoRepository.save(todo);
		
	}

}
