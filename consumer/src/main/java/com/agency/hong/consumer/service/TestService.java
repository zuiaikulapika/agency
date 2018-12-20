package com.agency.hong.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("client")
public interface TestService {
	
	@RequestMapping(value="/dc",method=RequestMethod.GET)
	String consumer();

}
