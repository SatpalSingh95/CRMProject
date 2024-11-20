package practice.datadriventesting;

public class RandomNumberWithAlphanumricData 
{
public static void main(String[] args) 
{
	/*
	// To generate Random Number
	Random random=new Random();
	int randomInt=random.nextInt(1000);
	System.out.println(randomInt);
	*/
	
// To generate Alphanumeric Data(number +alphabets)
int n=20;

// choose a Character random from this String

String AlphaNumericString="abcdefghijklmnopqrstuvwxyz0123456789";

// Create StringBuffer size of AlphaNumericString

StringBuilder sb=new StringBuilder(n);
for(int i=0;i<n;i++)
{
// generate a random number between 0 to alphaNumericString variable length
	
	int index =(int)(AlphaNumericString.length()*Math.random());

//add character one by one in end of sb
	
	sb.append(AlphaNumericString.charAt(index));
}
System.out.println(sb);


}
}
