

package com.cristian.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-word")
public class HelloWorldController {
	
	
	@GetMapping()
	public ResponseEntity<String> helloWold(){
		
		return new ResponseEntity<>("Hello World", HttpStatus.OK);
	}
	
	
	

}
