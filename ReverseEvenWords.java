package week1;

public class ReverseEvenWords {
	/*
	 * Pesudo code
	 * 
	 * Declare a string as
	 * 
	 * String test="I am a Senior Test Engineer"
	 * 
	 * Split the String into String Array using Space
	 * 
	 * Declare the for loop and find the odd index starting from 0
	 * 
	 * convert the String into char array
	 * 
	 * Declare a nested for loop and iterate to each character of the string array and store it on another String --> reversestring variable
	 * 
	 * Print the elements
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="I am a Senior Test Engineer";
		String[] testArray=test.split(" ");
		String reverse="";
		for (int i = 0; i < testArray.length; i++) {
			if(i%2==1)
			{
				char[] stringchars=testArray[i].toCharArray();
				for (int j = stringchars.length-1; j >=0; j--) {
					reverse=reverse+stringchars[j];
				}
			
				System.out.print(reverse+" ");
				reverse="";
			}
			else
			{
			System.out.print(testArray[i]+" ");
			}
		}
	}

}
