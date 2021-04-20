package Pavithra;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
    	System.out.print("Enter the Year: ");
    	int number = input.nextInt();
    	if(number%100==0 && number%400==0)
    	{
    		System.out.print("Leap Year");
    	}
    	else if (number%100!=0  && number%4==0) 
    	{
    		System.out.print("Leap Year");
		}
    	else
    	{
    		System.out.print("Not  an Leap Year");
    	}
    	
	}

}
