package com.agency.hong.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.agency.hong.client.interceptor.LoggerInterceptor;

@Configuration
@ComponentScan(basePackages= {})
public class WebAppConfigure extends WebMvcConfigurerAdapter{
	
	@Order(1)
	@Bean
	public FilterRegistrationBean  filterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		LoggerInterceptor interceptor=new LoggerInterceptor();
		List<String> urlPatternList=new ArrayList<>();
		urlPatternList.add("/*");
		registrationBean.setFilter(interceptor);
		registrationBean.setUrlPatterns(urlPatternList);
		return registrationBean;
	}

}
