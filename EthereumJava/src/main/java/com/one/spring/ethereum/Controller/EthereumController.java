package com.one.spring.ethereum.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.one.spring.ethereum.Blockchain.Application;

@RestController
public class EthereumController {
	
	
//	@Autowired
//	Application block;
	
	
	@GetMapping("/blockchain")
	public void TestAPI() throws Exception {
		
		Application.run();
		
	}
	
	@GetMapping("/blockchain-value/{value}")
	public void TestAPIValue( @PathVariable String value) throws Exception {
		
		Application.runWithValue(value);
		
	}
}
