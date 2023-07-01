package week1;

import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;


public class PintSingleOccuringNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,1,3,2,5};
		
	Map<Integer,Integer> numsMap= new LinkedHashMap<Integer,Integer>();
	
	for(int i=0;i<nums.length;i++)
	{
		numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0)+1);
	}
	
	for(Entry<Integer,Integer> entrySet:numsMap.entrySet())
	{
		if(entrySet.getValue()==1)
			System.out.println(entrySet.getKey());
	}
	
	}

}
