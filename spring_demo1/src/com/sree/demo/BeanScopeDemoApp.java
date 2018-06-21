package com.sree.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach coach = context.getBean("myCoach",Coach.class);
		
		Coach alphacoach = context.getBean("myCoach",Coach.class);
		
		boolean result = coach == alphacoach;
		System.out.println("\n"+result);
		System.out.println(coach+"\n"+alphacoach);
		context.close();
	}

}
