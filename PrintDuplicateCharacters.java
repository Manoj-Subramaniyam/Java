package week1;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="google";
		char[] charArray=word.toCharArray();
		Set<Character> dups= new HashSet<Character>();
		Set<Character> onlyDups= new HashSet<Character>();
		for(int i=0;i<charArray.length;i++)
		{
			boolean add= dups.add(charArray[i]);
			if(!add)
			{
				onlyDups.add(charArray[i]);
			}
		}
		System.out.println(onlyDups);
		
	}

}
