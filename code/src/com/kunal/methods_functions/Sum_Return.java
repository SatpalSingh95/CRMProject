package com.kunal.methods_functions;

import java.util.Scanner;

public class Sum_Return 
{
public static void main(String[] args) 
{
	int ans=sum2();
	System.out.println(ans);
}
static int sum2()
{
Scanner in = new Scanner(System.in);
int num1,num2,sum;

System.out.println("Enter a number 1: ");
 num1=in.nextInt();

System.out.println("Enter a number 2: ");
 num2=in.nextInt();
 
 sum=num1+num2;
 return sum;

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