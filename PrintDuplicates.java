package week1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  nums= {1,2,3,4,3,5,6,3,6,6};
		Set<Integer> nums1 = new LinkedHashSet<Integer>();
		Set<Integer> onlyNums = new LinkedHashSet<Integer>();
		
		for (int i=0;i<nums.length-1;i++) {
			
			boolean add=nums1.add(nums[i]);
			if(!add) {
				onlyNums.add(nums[i]);
			}
		}
		System.out.println(onlyNums);

	}

}
