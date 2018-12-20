package com.agency.hong.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "client", fallback = TestService.GreetingClientFallback.class)
public interface TestService {

	@RequestMapping(value = "/dc", method = RequestMethod.GET)
	String consumer();

	@Component
	public static class GreetingClientFallback implements TestService {

		@Override
		public String consumer() {
			return "client broken";
		}

	}
}
