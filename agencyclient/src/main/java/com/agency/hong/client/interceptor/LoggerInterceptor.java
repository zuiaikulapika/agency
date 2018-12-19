package com.agency.hong.client.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggerInterceptor implements Filter{

	Logger  log=LoggerFactory.getLogger(LoggerInterceptor.class);
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
				
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.debug("begin first log interceptor");
		chain.doFilter(request, response);
		log.debug("finish first log interceptor");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
