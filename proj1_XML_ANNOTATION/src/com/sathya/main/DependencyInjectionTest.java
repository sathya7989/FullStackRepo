package com.sathya.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathya.sbeans.WeekCal;

public class DependencyInjectionTest
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("com/sathya/cfgs/ApplicationContext.xml");
		
		WeekCal s=(WeekCal)ctx.getBean("wc");
		String msg=s.findTheWeek();
		System.out.println(msg);
	}


}
