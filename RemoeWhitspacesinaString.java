package Pavithra;

import java.util.Scanner;

public class RemoeWhitspacesinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
    	System.out.print("Enter the Value: ");
    	String  number = input.nextLine();
    	number=number.replaceAll("\\s", "");
    	System.out.println("After removing Spaces");
    	System.out.println(number);
	}

}
