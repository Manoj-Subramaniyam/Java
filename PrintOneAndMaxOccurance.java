package week1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintOneAndMaxOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String value="Amazon india";
		char[] valueArray=value.toLowerCase().toCharArray();
		//find one occurance Characters
		Map<Character,Integer>numOfChar=new LinkedHashMap<Character,Integer>();
		for(int i =0 ;i<valueArray.length;i++)
		{
			numOfChar.put(valueArray[i],numOfChar.getOrDefault(valueArray[i],0)+1);
		}
		for(Entry<Character,Integer> entrySet: numOfChar.entrySet())
		{
			if(entrySet.getValue()==1)
			{
				System.out.println(entrySet.getKey());
			}
		}
		
		//MaxOccurance
		int least=1;
		char single = 0;
		for(Entry<Character,Integer> entrySet:numOfChar.entrySet())
		{
			if(entrySet.getValue()>least)
			{
				least=entrySet.getValue();
				single=entrySet.getKey();
			}
		}
		System.out.println(single);
	}

}
