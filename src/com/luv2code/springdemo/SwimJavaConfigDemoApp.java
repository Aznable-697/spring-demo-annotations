package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//TODO Read spring config Java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//TODO Get the bean from Spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//TODO Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//TODO Call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//TODO Call our new swim Coach methods ... has the props values injected
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		//TODO Close the context
		context.close();
	}

}
