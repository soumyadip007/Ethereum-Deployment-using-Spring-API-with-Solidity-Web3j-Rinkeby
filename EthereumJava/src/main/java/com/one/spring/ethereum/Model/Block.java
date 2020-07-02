package com.one.spring.ethereum.Model;

public class Block {

	public String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Block(String data) {
		super();
		this.data = data;
	}

	public Block() {
		super();
	}
	
	
}
