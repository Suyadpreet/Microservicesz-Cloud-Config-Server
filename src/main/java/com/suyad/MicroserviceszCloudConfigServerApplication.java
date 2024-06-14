package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceszCloudConfigServerApplication
{

	public static void main(String[] args) 
	{
		SpringApplication.run(MicroserviceszCloudConfigServerApplication.class, args);
		System.out.println("Config Server has been Started Successfully..........");
	}

}
