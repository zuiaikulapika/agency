package com.agency.hong.eurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakeAPP 
{
    public static void main( String[] args )
    {
       SpringApplication.run(EurakeAPP.class, args);
    }
}
