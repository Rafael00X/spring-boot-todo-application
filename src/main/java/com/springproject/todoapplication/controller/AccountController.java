package com.springproject.todoapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springproject.todoapplication.repository.UserRepository;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/login")
	public String showLoginPage() {
		System.out.println("GET /login");
		return "login";
	}

	@GetMapping("/register")
	public String showRegisterPage() {
		return "register";
	}
}
