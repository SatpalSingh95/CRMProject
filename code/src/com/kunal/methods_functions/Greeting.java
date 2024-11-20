package com.kunal.methods_functions;

import java.util.Scanner;

public class Greeting
{
public static void main(String[] args) {
//	String message = greeting();
//	System.out.println(message);
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Name");
	String name=sc.nextLine();
	String personalized=myGreet(name);
	System.out.println(personalized);
	
}
static String myGreet(String name)
{
	String message="Hello "+name;
	return message;
}

static String greeting()
{
String greeting= "How are you";
return greeting;
}
}
