package week1;

import java.util.Set;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;

public class FindtheMissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {4,1,2,5,6,8,7,9,10,5,9};
		
		Set<Integer> numSet= new TreeSet<Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			numSet.add(nums[i]);
		}
		List<Integer> allNumbers=new ArrayList<Integer>(numSet);
		System.out.println(allNumbers);
		for(int i=0;i<allNumbers.size()-1;i++)
		{
			if(allNumbers.get(i)+1 != allNumbers.get(i+1))
			{
				System.out.println(allNumbers.get(i)+1);
				
			}
		}
	}

}
