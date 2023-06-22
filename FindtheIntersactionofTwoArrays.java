package week1;

public class FindtheIntersactionofTwoArrays {

	/*
	 * Pseudo code
	 * 
	 * Declare two arrays
	 * array1={1,5,9,11,33,55}
	 * array2={1,4,2,11,55,67,88}
	 * 
	 * Declare a for loop and iterate through each element starting from 0
	 * 
	 * Declare a neste for loop and iterate through another array  starting from 0
	 * 
	 * if both are match then print the number
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1={1,5,9,11,33,55};
		int[] nums2={1,4,2,11,55,67,88};
		
		for (int i =0;i<nums1.length;i++)
		{
			for (int j=0;j<nums2.length;j++)
			{
				if(nums1[i]==nums2[j])
				{
					System.out.println(nums1[i]);
				}
			}
		}
	}

}
