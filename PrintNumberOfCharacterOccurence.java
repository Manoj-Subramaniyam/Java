package week1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintNumberOfCharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Convert the String to CharArray
		 * intialize LinkedHashMap
		 * Initialize for loop and iterate through each element
		 * if key is present then get the value of th key and add 1
		 * else put the kay and value as 1
		 */
		String value="Amazon india";
		char[] valueArray=value.toLowerCase().toCharArray();
		Map<Character,Integer>numOfChar=new LinkedHashMap<Character,Integer>();
		for(int i =0 ;i<valueArray.length;i++)
		{
			if(numOfChar.containsKey(valueArray[i]))
			{
				numOfChar.put(valueArray[i],numOfChar.get(valueArray[i])+1);
			}
			else
			{
				numOfChar.put(valueArray[i],1);
			}
		}
		
		System.out.println(numOfChar);
		
		Map<Character,Integer>numsOfChar1= new LinkedHashMap<Character,Integer>();
		
		for(int i =0 ;i<valueArray.length;i++)
		{
			numsOfChar1.put(valueArray[i],numsOfChar1.getOrDefault(valueArray[i],0)+1);
		}
		System.out.println(numsOfChar1);
	}
	
	//another way
	
	
	
			
			

}
