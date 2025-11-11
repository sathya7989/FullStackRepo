package com.sathya.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathya.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		ApplicationContext ctx = 
		        new ClassPathXmlApplicationContext("com/sathya/cfgs/application.xml");
		Object obj=ctx.getBean("wmg");
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		String msg=generator.showWishMessage("sathya");
		System.out.println(msg);
	
	}
}
