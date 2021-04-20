package Pavithra;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumbersinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
    	System.out.print("Enter the Value: ");
    	String  number = input.nextLine();
		Pattern pattern = Pattern.compile("\\d+");
	      Matcher matcher = pattern.matcher(number);
	      System.out.println("Digits in the given string are: ");
	      while(matcher.find()) {
	          System.out.print(matcher.group()+" ");
	       }
	}

}
