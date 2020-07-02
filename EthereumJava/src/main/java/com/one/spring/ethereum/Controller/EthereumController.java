package com.one.spring.ethereum.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.one.spring.ethereum.Blockchain.Application;
import com.one.spring.ethereum.Blockchain.Data;
import com.one.spring.ethereum.Model.Block;

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
		
		
		System.out.println(value);
	//	Application.runWithValue();
		
	}
	
	@PostMapping("/blockchain-post")
	public void TestAPIPostValue( @RequestBody Block block) throws Exception {
		
		System.out.print(block.data);
		System.out.print(block.data);
		System.out.print(block.data);
		System.out.print(block.data);
		System.out.print(block.data);
		System.out.print(Data.data);
		
		Data.data=block.data;
		System.out.print(Data.data);
		
		
		//Application.run();
	}
}
