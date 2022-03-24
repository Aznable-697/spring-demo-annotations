package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//TODO Read spring config Java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//TODO Get the bean from Spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//TODO Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//TODO Call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//TODO Close the context
		context.close();
	}

}
