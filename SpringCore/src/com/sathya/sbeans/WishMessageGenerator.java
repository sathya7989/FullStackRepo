package com.sathya.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator
{

	private LocalTime time;
	

	public WishMessageGenerator( ) {

		System.out.println("WishMessageGenerator: 0 -param constructor");

	}
	public void setTime(LocalTime time) 
	{
		System.out.println("WishMessageGenerator.setTime()");
		this.time=time;
	}

	public String showWishMessage(String User)
	{
		
		System.out.println("WishMessageGenerator.showWishMessage()");
		int hour=time.getHour();
		if(hour<12)
			return "Good Morning ::"+User;
		else if(hour<16)
			return "Good AfterNoon:"+User;

		else if(hour<20)
			return "Good Evening:"+User;
		else
			return "GoodNight:"+User;
	}


}
