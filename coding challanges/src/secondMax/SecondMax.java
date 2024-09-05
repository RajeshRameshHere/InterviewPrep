package secondMax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SecondMax {
	
	public static void main(String[] args) {
		
		int[]arr= {1,3,5,2,6,4,3,3,5,9,10,10};
		
		Arrays.sort(arr);
		
		System.out.println(arr.length-2);
		List<Integer> result=new ArrayList<Integer>();
		for (int i = 0; i < arr.length-1; i++) {
				if (arr[i]<arr[i+1]&&arr[i]!=arr[i+1]) {
				
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					result.add(arr[i]);
				}                                                                 
			
				 		}
		System.out.println(result);
		System.out.println(result.indexOf(result));
//		System.out.println(result.indexOf(result.size()-1));
	}
	   

}
