package com.one.spring.ethereum.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EthereumController {

	@GetMapping("/blockchain")
	public void TestAPI() {
		System.out.println("HELLO BLOCKCHAIN");
		System.out.println("HELLO BLOCKCHAIN");
		System.out.println("HELLO BLOCKCHAIN");
		System.out.println("HELLO BLOCKCHAIN");
		System.out.println("HELLO BLOCKCHAIN");
	}
}
