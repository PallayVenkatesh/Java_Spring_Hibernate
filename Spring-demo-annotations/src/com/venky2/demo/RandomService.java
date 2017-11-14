package com.venky2.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	private String[] data ={ "hi ra ala unav?", "Emra ala unav ?", "Em kaka ala unav ?"};
	
	private Random rd = new Random();
	int num = rd.nextInt(data.length);
	
	
	public String getFortune() {
		// TODO Auto-generated method stub
		return data[num];
	}

}
