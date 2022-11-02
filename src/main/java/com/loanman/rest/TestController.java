package com.loanman.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Loan Management System";
	}
}
