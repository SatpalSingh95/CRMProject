package practice.basic1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaBasics 
{
public static void main(String[] args) {
	 Date dateobj=new Date();
	//  System.out.println(dateobj.toString()); // Mon Sep 30 17:13:14 IST 2024 this is raw type data we need in format.
	 
	/*
	 SimpleDateFormat sim= new SimpleDateFormat("yyyy-mm-dd");
	 String  actualDate=sim.format(dateobj);
	 System.out.println(actualDate);
	 
	 */
	 
	 
	 SimpleDateFormat sim= new SimpleDateFormat("yyyy-MM-dd");
	 String  actualDate=sim.format(dateobj);
	 System.out.println(actualDate);
	 
	Calendar cal= sim.getCalendar();
	//cal.add(Calendar.DAY_OF_MONTH, -30);
	cal.add(Calendar.DAY_OF_MONTH, 30);
	String dateRequires=sim.format(cal.getTime());
	System.out.println(dateRequires);
	
	 
	 
	 
}
}
