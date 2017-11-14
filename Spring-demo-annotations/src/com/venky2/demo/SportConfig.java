package com.venky2.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.venky2.demo")
@PropertySource("classpath:Sport.properties")
public class SportConfig {

	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(sadFortuneService());
		
	}
}
