package com.cognizant.truyum.util;
import java.util.Date;
import java.text.*;
public class DateUtil 
{
	public static Date convertToDate(String date) throws ParseException
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date launchDate=sdf.parse(date);
		return launchDate;
		
	}

}
