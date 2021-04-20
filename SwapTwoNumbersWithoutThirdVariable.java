package Pavithra;

import java.util.Scanner;

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
    	System.out.print("Enter a Number: ");
    	int number = input.nextInt();
    	System.out.print("Enter Second Number: ");
    	int number1 = input.nextInt();
    	number= number1+number;
    	number1=number-number1;
    	number=number-number1;
    	System.out.println("After Swapping");
    	System.out.println(number);
    	System.out.println(number1);
	}

}
