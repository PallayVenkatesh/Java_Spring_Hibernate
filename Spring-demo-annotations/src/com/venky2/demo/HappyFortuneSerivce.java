package com.venky2.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneSerivce implements FortuneService {

	public String getFortune() {
		// TODO Auto-generated method stub
		return "Eroju nundi neku Lucky...! ";
	}

}
