package Pavithra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReplaceanElementinaList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> l2 = new ArrayList<Integer>(); 
        l2.add(1); 
        l2.add(2); 
        l2.add(3); 
        Collections.replaceAll(l2,2,1);;
        for (Integer integer : l2) {
			System.out.println(integer);
		}
	}

}
