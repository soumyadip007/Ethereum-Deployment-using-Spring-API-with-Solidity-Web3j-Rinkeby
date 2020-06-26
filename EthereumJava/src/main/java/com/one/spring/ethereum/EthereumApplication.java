package com.one.spring.ethereum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@ComponentScan({"com.one.spring.ethereum.*"})
@EntityScan("com.one.spring.ethereum.*")
@SpringBootApplication
public class EthereumApplication {

	public static void main(String[] args) {
		SpringApplication.run(EthereumApplication.class, args);
	}

}
