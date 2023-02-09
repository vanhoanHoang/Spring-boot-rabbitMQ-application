//package com.hoanhoang.rabbitmq.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.hoanhoang.rabbitmq.producer.RabbitMQProducer;
//
//@RestController
//@RequestMapping("/api/v1")
//public class RabbitMQController {
//
//	@Autowired
//	private RabbitMQProducer producer;
//	
//	@PostMapping("/status")
//	public ResponseEntity<String> sendMessage() {
//		producer.sendMessages("Hello Rabbit MQ Consumers");
//		
//		return new ResponseEntity<String>("OK", HttpStatus.OK);
//	}
//}
