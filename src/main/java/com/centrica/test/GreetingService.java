package com.centrica.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class GreetingService {
	
	
	@RequestMapping(value="/greetings",method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public ResponseEntity<Greeting> getGreeting() {
		return new ResponseEntity<Greeting>(new Greeting("Hello World") , HttpStatus.OK);
	}
	

}
