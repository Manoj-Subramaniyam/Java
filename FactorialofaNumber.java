package Pavithra;

import java.util.Scanner;

public class FactorialofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
    	System.out.print("Enter the numberr: ");
    	int number = input.nextInt();
    	fact(number,1);
	}
	
	public static void  fact(int number,int mul)
	{
		if (number-1>0)
		{
			
		mul=mul*(number*(number-1));
		
		number=number-2;
		System.out.println(mul);
		fact(number,mul);
		}
		else
		{
			System.out.println(mul);
		}
	}

}
