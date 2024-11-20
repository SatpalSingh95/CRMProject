package com.kunal.methods_functions;

import java.util.Scanner;

/* 
  access modifier(we'll look in OOP) return_type name (arguments)
  {
  // body
    return statement;
  }
*/
public class Sum 
{
public static void main(String[] args) 
{
	sum(); // function calls
	sum();
	}
static void sum()
{
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
