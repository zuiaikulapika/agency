package com.agency.hong.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class ConsumerApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerApp.class, args);
    }
}
