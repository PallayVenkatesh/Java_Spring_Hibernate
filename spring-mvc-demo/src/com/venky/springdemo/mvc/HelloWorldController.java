package com.venky.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
		
	}
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
		
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model){
		
		String thename = request.getParameter("studentName");
		 thename = thename.toUpperCase();
		 
		 String result = "Yo!" + thename; 
		 
		 model.addAttribute("message", result);
		
		return "helloworld";
		
	}
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String thename, Model model){
		
		
		 thename = thename.toUpperCase();
		 
		 String result = "Yo! work ayindi rooo --> " + thename; 
		 
		 model.addAttribute("message", result);
		
		return "helloworld";
		
	}
}
