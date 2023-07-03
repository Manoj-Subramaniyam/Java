package week1;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class FindMostDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * find the most Duplicate--> firt most Duplicate
		 * 
		 * input : hello output : l
		 * 
		 * input : abbaba output: b
		 */
		String value = "abbaba";
		char[] valueArray = value.toCharArray();
		Map<Character, Integer> valueMap = new HashMap<Character, Integer>();
		char maxOccurence=0;
		int maxValue=0;
		
		for (int i = 0; i < valueArray.length; i++) {
			valueMap.put(valueArray[i], valueMap.getOrDefault(valueArray[i], 0) + 1);
			if(valueMap.get(valueArray[i])>maxValue)
			{
				maxOccurence=valueArray[i];
				maxValue=valueMap.get(valueArray[i]);
			}
			
		}
		System.out.println(maxOccurence);
		int k = 1;
		for (Entry<Character, Integer> entry : valueMap.entrySet()) {
			if (entry.getValue() > k) {
				k = entry.getValue();
			}
		}
		for (Entry<Character, Integer> entry : valueMap.entrySet()) {
			if (entry.getValue() == k) {
				System.out.println(entry.getKey());
			}
		}
	}

}
