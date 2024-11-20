package com.kunal;

import java.util.Scanner;

public class Loops 
{
public static void main(String[] args) 
{
// print 5 times
//	System.out.println("Hello World");
//	System.out.println("Hello World");
//	System.out.println("Hello World");
//	System.out.println("Hello World");
//	System.out.println("Hello World");
	
	/* syntax of for loop
	 
	 for(initialization;conditions;increment/decrement)
	 //body
	 
	 */
	
	// print numbers from 1 to 5
/*	for(int num=1;num<=5;num+=1)
	{
		System.out.println(num);
	}
	//print numbers from 1 to n
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	for(int num=1;num<=n;num++)
	{
		//System.out.print(num+" ");
		System.out.println("Hello World");
	}
	*/
	
	// while loop
	/*
	while(condition)
	{
		//body
	}
	*/
	
	
	int num =1;
	while(num<=5)
	{
		System.out.println(num);
		num+=1;
	}
	// you need to run while loop when you do not know how many times the loop is going to run.
	// In for loop you already know how many times the loop is going to run.
	
	/*
	 e.g if the question like print the first 10 numbers then you use the for loop
	 if the question be like keep taking input from user till the user does not press X. 
	 Here do you know the how many times loop will run. No. It depends on the User
	 till the user will not press the X that many times of amount like the loop will be
	 running. so in that case use while loop.
	 
	 */
	
	// do while loop
	/*
	do {
		// body
	}
	while(condition);
	*/
	/*
	int n=1;
	do {
		System.out.println(n);
		n++;
	}
	while(n<=5);
	*/
	
	int n=1;
	do {
		System.out.println("hello world");
		
	}
	while(n!=1);
	
	
}
}
