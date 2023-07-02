package week1;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintSumofTwoDigitsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 4, 6, 8, 10,3,5, 12 };
		int sum = 8;
		Map<Integer, Integer> numsMap = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int temp=sum-nums[i];
			if(numsMap.containsKey(temp))
			{
				System.out.println(nums[i]+" "+temp);
			}
			else
			{
				numsMap.put(nums[i],i);
			}
		}
		
	}

}
