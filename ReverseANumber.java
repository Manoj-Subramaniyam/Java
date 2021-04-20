package Pavithra;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter a Number: ");
    	int number = input.nextInt();
    	String s= Integer.toString(number);
    	
    	int Length=s.length();
    	String Palindrome="";
    	while(number>0) 
    	{
    		int a=number%10;
			Palindrome+=Integer.toString(a);
			number=number/10;
		}
    	System.out.println("The Reverse of the Number is:"+Palindrome);
	}

}
