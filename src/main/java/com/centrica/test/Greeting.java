package com.centrica.test;

import java.io.Serializable;

public class Greeting implements Serializable {

	private String message;
	
	public Greeting(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}
}
