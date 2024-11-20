package com.kunal;
// reverse number
//// n%10 give last digit or reminder   15%10=5
// n/10 give quotient   150/10 =15
public class ReverseNumber
{
public static void main(String[] args) {
	
int n=23597;
int rev=0;
while(n>0)
{
rev=rev*10+n%10;	
n=n/10;
}
System.out.println(rev);
}
}
