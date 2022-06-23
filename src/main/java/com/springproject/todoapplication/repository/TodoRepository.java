package com.springproject.todoapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.todoapplication.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
	public List<Todo> findByUserUserId(Long userId);

}