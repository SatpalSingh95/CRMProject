package com.kunal;

public class Conditional {

	public static void main(String[] args)
	{
		/* Syntax of if statements : 
		     if(boolean expression T or F)
		     {
		     //body
		     
		     }
		     else
		     {
		     //body
		     }
		     
		     */
	int salary = 25400;
//		if(salary>10000)
//		{
//			salary =salary+2000;
//		}
//		else
//		{
//			salary=salary+1000;
//		}
		
		//multiple if-else
		
		if(salary>10000)
		{
			salary+=2000;
		}
		else if(salary>20000)
		{
			salary+=3000;
		}
		else
		{
			salary+=1000;
		}
		
System.out.println(salary);
		
		
		int a=10;
		int b=20;
		if(a==10&&b==20)
		{
			System.out.println("Hello World");
		}
		if(a==10 || b==20)
		{
			System.out.println("Hello World");
		}
		if(a!=35)
		{
			System.out.println("Hello world");
		}
	}

}
