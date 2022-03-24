package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//TODO Create an array of strings
	private String[] data = {
			"When you don't care who gets the credit, there's no limit to how high you can climb.",
			"One can never fill another's shoes, rather he must outgrow the old shoes.",
			"It is better to be a warrior in a garden, than a gardner in a war."
	        };
	
	//TODO Create a random number generator
	private Random myRandom = new Random();	
	
	@Override
	public String getFortune() {	
		//TODO pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
