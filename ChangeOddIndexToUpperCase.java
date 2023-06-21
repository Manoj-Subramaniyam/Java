package week1;

public class ChangeOddIndexToUpperCase {

	/*
	 * Pesudo code
	 * 
	 * Declare a variable String test="startcoding"
	 * 
	 * convert the string in to characters
	 * 
	 * iterate through each character using loop
	 * 
	 * for odd index change the character to uppercase
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="startcoding";
		char[] charArray= test.toCharArray();
		String result="";
		for (int i=0;i<test.length();i++)
		{
			if(i%2==0)
			{
				result=result+Character.toUpperCase(charArray[i]);
			}
			else {
				result=result+charArray[i];
			}
		}
		System.out.println(result);
	}

}
