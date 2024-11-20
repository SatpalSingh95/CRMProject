package com.kunal;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		int empID=in.nextInt();
		String department=in.next();
		
		switch(empID)
		{
		case 1:
		     System.out.println("Satpal Singh");
	    break;
	    case 2:
	     System.out.println("King Khan");
	     break;
	    case 3:
	    	System.out.println("Emp Number 3");
	    	switch(department)
			{
			case "IT":
			     System.out.println("IT Department");
		    break;
		    case "Management":
		     System.out.println("Management");
		     break;
		     default:
		    	 System.out.println("No department entered ");
	     		}
	    	break;
	    	default:
	    		System.out.println("Enter correct EmplID");
		}
		
		
	}
}
