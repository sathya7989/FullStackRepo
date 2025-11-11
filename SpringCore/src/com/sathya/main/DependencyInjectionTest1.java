package com.sathya.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathya.sbeans.Seasons;

public class DependencyInjectionTest1 
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = 
		        new ClassPathXmlApplicationContext("com/sathya/cfgs/applicationContext.xml");
		Object obj=ctx.getBean("seasons");
		Seasons generator=(Seasons)obj;
		String uname=generator.displaySeason("sathya");
		System.out.println(uname);
	}
}
