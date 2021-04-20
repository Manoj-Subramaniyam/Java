package Pavithra;

import java.util.Scanner;

public class CountCharactersinAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
    	System.out.print("Enter the Value: ");
    	String  number = input.nextLine();
    	int count=number.length();
    	 char[] ch = new char[count];
    	for (int i = 0; i < number.length(); i++)
    	{
    		//System.out.println(number.charAt(i));
			ch[i]= number.charAt(i);
		}
    	System.out.print("Enter the character: ");
    	String  number1 = input.nextLine();
    	int counter=0;
    	
    	for (int i = 0; i < ch.length; i++) 
    	{
			if (ch[i]==number1.charAt(0)) {
				counter+=1;
			}
		}
    	System.out.println(counter);
	}

}
