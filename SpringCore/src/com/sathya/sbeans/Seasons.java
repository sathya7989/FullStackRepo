package com.sathya.sbeans;

import java.time.LocalDate;
import java.time.Month;

public class Seasons
{
	private LocalDate date;

	public Seasons( )
	{

		System.out.println("Seasons.Seasons()");

		this.date = date;
	}

	public void setDate(LocalDate date)
	{
		System.out.println("Seasons.setDate()");
		this.date = date;
	}

	public String displaySeason(String user) 
	{

		System.out.println("Seasons.displaySeason()");
		
		if(date==null)
			return "no season for user" + user;
		
		int month=date.getMonthValue();
		
		String season;

		if(month==12|| month==1||month==2) 
		{
			season =("its winter "+ user);

		}
		else if(month>=3 && month<=5)
		{
			season=	("its summer"+user);

		}
		else if(month>=6 && month<=8)
		{
			season=("its mansoon"+user);

		}
		else if(month>=9 && month<=11)
		{
			season=("its autumn"+" "+user);

		}

		else
		{
			season="unknown";

		}  
		return season ;

	}

}
