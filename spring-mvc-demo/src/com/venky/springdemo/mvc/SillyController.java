package com.venky.springdemo.mvc;

import org.springframework.web.bind.annotation.RequestMapping;

public class SillyController {

	/**
	 * @param args
	 */
	@RequestMapping("/showForm")
	public String displayTheForm(){
		return "Silly"; 
	}

}
