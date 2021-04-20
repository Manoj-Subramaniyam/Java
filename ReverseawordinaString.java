package Pavithra;

import java.util.Scanner;

public class ReverseawordinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
    	System.out.print("Enter the Value: ");
    	String  number = input.nextLine();
    	String[] s=number.split(" ");
    	String[] s1=new String[s.length];
    	
    	//System.out.println(s.length-1);
    	for (int i = (s.length-1); i > -1; i--)
    	{
    		String temp="";
    		//System.out.println("yes");
			for (int j = (s[i].length())-1; j > -1; j--) 
			{
				temp+= s[i].charAt(j);
			}
			s1[i]=temp+" ";
			//System.out.println(temp);
		}
    	String final1=String.join(" ", s1);
    	System.out.println(final1.trim());

	}

}
