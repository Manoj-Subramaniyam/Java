package Pavithra;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter an integer: ");
    	int number = input.nextInt();
    	int i=0;
    	for (int j = 2; j < (number/2)+1; j++) 
    	{
			
    		if(number%j==0)
    		{
    			i=1;
    			break;
    		}
    	
    	}
    	if(i==1)
    	{
    		System.out.println("Not Prime Number");
    	}
    	else
    	{
    		System.out.println("Prime Number");
    	}

	}

}
