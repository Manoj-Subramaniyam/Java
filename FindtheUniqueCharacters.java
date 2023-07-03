package week1;

import java.util.Set;
import java.util.HashSet;

public class FindtheUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String name='siri'
		 * 
		 * Expected = s i r
		 * Pseudo code
		 * 
		 * convert the string into Char array
		 * initialize the set
		 * add the element to the set using for loop--> set.add
		 * print the set 
		 */
		String name="siri";
		
		char[] nameArray=name.toCharArray();
		Set <Character> nameSet=new HashSet<Character>();
		for(int i=0;i<nameArray.length;i++) {
			if(!nameSet.add(nameArray[i]))
			{
				nameSet.remove(nameArray[i]);
			}
		}
		System.out.println(nameSet);
	}

}
