package Pavithra;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
    	System.out.print("Enter the Value: ");
    	String  number = input.nextLine();
    	if(number.matches("^[a-zA-Z]*$"))
    	{
    		System.out.println("Entered Input is Alphabet");
    	}
    	else
    	{
    		System.out.println("Entered Input is Not an Alphabet");
    	}

	}

}
