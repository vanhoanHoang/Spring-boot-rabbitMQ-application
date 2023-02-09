package com.hoanhoang.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hoanhoang.rabbitmq.config.RabbitMQConfig;

@SpringBootApplication
public class SpringRabbitmqApplication{

	@Autowired
	private RabbitMQConfig config;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitmqApplication.class, args);
	}

	
}
