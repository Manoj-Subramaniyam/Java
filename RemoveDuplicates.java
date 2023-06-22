package week1;

public class RemoveDuplicates {
	
	/*
	 * Pseudo code
	 * Declare a String 
	 * String text="java is a programming language,java basics are important. so i am learning java everyday"
	 *
	 *convert into array by split the string based on Space
	 *
	 *declare a for loop and iterate through each words starting from 0
	 *
	 *declare a nested for loop and iterate though each words starting from i+1
	 *
	 *if both match then replace the original string with the same word in the array 1
	 *
	 */
	public static void main(String[] args) {
		String text="java is a programming language, java basics are important. so i am learning java everyday";
		String[] textArray=text.split(" ");
		for(int i=0;i<textArray.length-1;i++)
		{
			for (int j=i+1;j<textArray.length;j++)
			{
				if(textArray[i].equals(textArray[j]))
				{
					text= text.replace(textArray[i], "");
				}
			}
		}
		System.out.println(text);
	}

}
