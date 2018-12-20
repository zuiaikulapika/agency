package com.agency.hong.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agency.hong.consumer.service.TestService;

@RestController
public class TestController {
		
	@Autowired
	TestService service;
	
	@GetMapping("/consumer")
	public String dc() {
		return service.consumer();
	}
}
