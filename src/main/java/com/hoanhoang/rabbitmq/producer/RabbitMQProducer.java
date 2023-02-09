//package com.hoanhoang.rabbitmq.producer;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//@Service
//public class RabbitMQProducer {
//	
//	//private static final Logger logger = LoggerFactory.getLogger(RabbitMQProducer.class);
//
//	@Value("${rabbitmq.binding.exchange.queue}")
//	private String binding;
//
//	@Value("${rabbitmq.exchange.name}")
//	private String exchange;
//
//	private RabbitTemplate rabbitTemplate;
//
//	public RabbitMQProducer(RabbitTemplate rabbitTemplate) {
//		this.rabbitTemplate = rabbitTemplate;
//	}
//	
//	public void sendMessages(String message) {
//		//rabbitTemplate.send(new Message(message.getBytes()));
//		rabbitTemplate.convertAndSend(message);
//		//logger.info("Message has been sent");
//		
//	}
//}
