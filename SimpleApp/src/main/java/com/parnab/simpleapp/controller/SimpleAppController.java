package com.parnab.simpleapp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleAppController {
	
	@RequestMapping(value = "/function/square/{input}", method= RequestMethod.GET)
	public int squareOf(@PathVariable int input) {
		return input * input;
	}

}
