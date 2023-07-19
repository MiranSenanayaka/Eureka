package com.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/payment")
public class ClientApplication {

	@GetMapping("/pay")
	public String doPayment(){
		return "Payment Done!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
