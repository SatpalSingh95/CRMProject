package com.kunal;

import java.util.Scanner;

public class CaseCheck
{
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//char ch=in.next().trim().charAt(0);
	
	// trim()==> remove all the extra spaces that are at the end of these words.
	//System.out.println(in.next());
	//System.out.println(in.next().trim());
	
	/*
	char ch=in.next().trim().charAt(0);
	System.out.println(ch);
	*/
	/*
	String word="Hello";
	System.out.println(word.charAt(0));
     */
	
	
	char ch=in.next().trim().charAt(0);
	System.out.println(ch);
	if(ch>'a'&& ch<='z')
	{
	System.out.println("Lower case");	
	}
	else
	{
		System.out.println("Upper case");	
	}
	
	
	
	// 0,1,1,2,3,5,8,13,... find the nth fibonnachi number
	
	int a=0;
	int b=1;
	int n=7;
}
}
