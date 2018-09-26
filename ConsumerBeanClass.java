package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.spring.controller.SpringConsumerClass;

@SpringBootApplication
public class ConsumerBeanClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = SpringApplication.run(
				ConsumerBeanClass.class, args);
		
		SpringConsumerClass consumerControllerClient=ctx.getBean(SpringConsumerClass.class);
		System.out.println(consumerControllerClient);
		consumerControllerClient.getEmployee();
		
	}
	
	@Bean
	public  SpringConsumerClass  consumerControllerClient()
	{
		return  new SpringConsumerClass();
	}
		
		

	}


