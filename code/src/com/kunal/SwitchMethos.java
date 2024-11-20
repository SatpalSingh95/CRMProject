package com.kunal;

import java.util.Scanner;

public class SwitchMethos 
{
public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	//String fruit =in.next();
	
	/*
	String a="kunal";
	String b="kunal";
	System.out.println(a==b);
	
	//equals() method compares only value not references.
	// == compares both value and its references.
	
	if(fruit.equals("mango"))
	{
		System.out.println("King of fruit");
	}
	if(fruit.equals("apple"))
	{
		System.out.println("a sweet red fruit");
	}
}
}
*/
	
	/*
	switch(fruit)
	{
	case "Mango":
     System.out.println("King of fruits");
  //   break;
	case "Apple":
	     System.out.println("A sweet red fruit");
       break;
	case "Orange":
	     System.out.println("round  fruit");
      break;
	case "Grapes":
	     System.out.println("small  fruit");
     break;
     default:
    	 System.out.println("Plz enter a valid fruit");
       }
       */
	
	/*
	int day=in.nextInt();
	switch(day)
	{
	
	case 1:
	     System.out.println("Monday");
       break;
	case 2:
	     System.out.println("Tuesday");
      break;
	case 3:
	     System.out.println("Wensday");
     break;
	case 4:
	     System.out.println("Thursday");
    break;
	case 5:
	     System.out.println("Friday");
    break;
	case 6:
	     System.out.println("Saturday");
    break;
    case 7:
     System.out.println("Sunday");
      break;
     
       }
	*/
	
	
	int day=in.nextInt();
	switch(day)
	{
	case 1:
    
	case 2:
	 
	case 3:
	   
   
	case 5:
	     System.out.println("Weekday");
    break;
	case 6:
	   
	case 7:
	     System.out.println("Weekend");
    break;
     default:
    	 System.out.println("Plz enter a valid week");
       }
		}
	}