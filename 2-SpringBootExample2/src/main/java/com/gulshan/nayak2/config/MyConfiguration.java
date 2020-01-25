package com.gulshan.nayak2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MyConfiguration {

	public MyConfiguration() {
		System.out.println("In MyConfiguration()..!");
	}
	
	@Profile("qa")
	@Bean
	public void configureQASetup() {
		System.out.println("In configureQASetup()...!");
	}
	
	@Profile("uat")
	@Bean
	public void configureUATSetup() {
		System.out.println("In configureUATSetup()...!");
	}
	
	@Profile("prod")
	@Bean
	public void configurePRODSetup() {
		System.out.println("In configurePRODSetup()...!");
	}
}
