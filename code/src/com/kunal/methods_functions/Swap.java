package com.kunal.methods_functions;

import java.util.Scanner;

public class Swap {
	static int num1,num2;
	
	public static void main(String[] args) {
		
		
		/*
		// swap two numbers
		int temp =a;
		a=b;
		b=temp;
		
		System.out.println(a+" "+b);
		
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  number1");
		int a= sc.nextInt();
		System.out.println("Enter  number2");
		int b=sc.nextInt();
		swap(a,b);
		System.out.println(num1+" "+num2);
	}
	static void swap(int a,int b)
	{ 
	int	temp=a;
	 num1=b;
		 num2=temp;

}
}
