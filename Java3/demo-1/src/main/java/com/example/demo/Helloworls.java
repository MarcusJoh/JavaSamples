package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller  
@RestController
public class Helloworls {

//using get method and hello-world as URI  
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@RequestMapping(value = "/score", method = RequestMethod.GET)
	public String update(String rev) {
		StringBuilder sb = new StringBuilder(rev);

		return sb.reverse().toString();
	}

}