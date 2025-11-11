package com.sathya.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;





@Component("wc")

public class WeekCal 
{
	@Autowired
	private LocalDate date;
	
	public WeekCal() 
	{
		System.out.println("WeekCal:-0 param constructor");
	}
	
	public void setDate(LocalDate date)
	{
		System.out.println("WeekCal.setDate()");
		this.date = date;
	}

	//business method
	public String findTheWeek()
	{
		 int week=date.getDayOfWeek().getValue();
		 String weekend;
		 if(week<=6&&week>=1)
		 {
			 weekend=("happy working days");
		 }
		 else 
		 {
			 weekend="happy weekends";
		 }
		 return weekend;
		 
	}
	
}
