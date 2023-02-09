package com.hoanhoang.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Configuration
public class RabbitMQConfig {
	
	@Value("${rabbitmq.queue.name}")
	private String queue;
	
	@Value("${rabbitmq.exchange.name}")
	private String exchange;
	
	@Value("${rabbitmq.binding.exchange.queue}")
	private String binding;
	
	@Bean
	public Queue queue(String name) {
		return new Queue(name);
	}
	
	@Bean
	public TopicExchange exchange(String name) {
		return new TopicExchange(name);
	}
	
	@Bean
	public Binding binding() {
		return BindingBuilder.bind(queue(queue)).to(exchange(exchange)).with(binding);
	}
}
