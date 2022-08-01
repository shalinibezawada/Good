package com.info.ii.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
@GetMapping ("/hello")	
public String hello() {
	return "hi hello";
	
	
}
}
