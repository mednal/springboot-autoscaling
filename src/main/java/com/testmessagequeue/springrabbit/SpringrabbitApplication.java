package com.testmessagequeue.springrabbit;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableRabbit
public class SpringrabbitApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringrabbitApplication.class, args);
	}


}
