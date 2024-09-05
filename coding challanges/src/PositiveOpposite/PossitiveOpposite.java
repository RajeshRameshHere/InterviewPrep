package PositiveOpposite;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PossitiveOpposite {
	
	
	public static void main(String[] args) {
		int [] arr={-7, 4, -3, 2, 2 ,-8 ,-2 ,3, 3 ,7, -2, 3, -2};

		
		Set<Integer> positiveOpposite = positiveOpposite(arr);
		System.out.print("positive opposite numbers are:");
		int result[]=new int[positiveOpposite.size()];
		int index=0;
		for(int a:positiveOpposite) {
			result[index++]=a;
			
		}
		for(int i:result)
		System.out.print(" "+i+" ");
	}
	
	public static Set<Integer> positiveOpposite(int[]arr){
		
		//2,42,5,3,2,-2,-3,-5,5;
		Set<Integer>set=new HashSet<Integer>();
		Set<Integer>positives=new HashSet<Integer>();
		
		for(int e:arr) {
			
			if(set.contains(-e)) {
				
				positives.add(Math.abs(e));
				
			}
			set.add(e);
		}
		System.out.println(positives);
		return positives;
	}

}
