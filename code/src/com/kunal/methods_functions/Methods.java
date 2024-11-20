package com.kunal.methods_functions;

import java.util.Scanner;

public class Methods 
{
public static void main(String[] args) 
{
// Q: Take input of 2 numbers and print the sum
	
	Scanner in = new Scanner(System.in);
	int num1,num2,sum;
	
	System.out.println("Enter a number 1: ");
	 num1=in.nextInt();
	
	System.out.println("Enter a number 2: ");
	 num2=in.nextInt();
	 
	 sum=num1+num2;
	 System.out.println("The sum = " + sum);
	 
	 
}
}
