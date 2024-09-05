package DuplicateNumbers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Duplicates {
	
	
	public static void main(String[] args) {
		int array[]= {1,3,2,1,4,2,5,2,5,1,6,7,6};
		
		int[] findDuplicates = findDuplicates(array);
		
		System.out.println("duplicates"+Arrays.toString(findDuplicates));
		int[] uniqeArray = nonDuplicateArray(array);
		System.out.println("uniqe numbers, no duplicates"+Arrays.toString(uniqeArray));
		
//		
		
	}
	
	public static int[] nonDuplicateArray(int[]arr) {
		
		Set<Integer> arrySet=new HashSet<Integer>();
		
		for(int e:arr) {
			
			arrySet.add(e);
		}
		
		int []original=new int[arrySet.size()];
		int i=0;
		for(int e:arrySet) {
			original[i++]=e;
			
		}
		return original;
	}

public static int[] findDuplicates(int arr[]) {
//	Set<Integer> duplicates=new HashSet<Integer>();
//
//	for (int i = 0; i < arr.length; i++) {
//		for (int j = i+1; j < arr.length; j++) {
//			if(arr[i]==arr[j]) {
//				duplicates.add(arr[i]);
//			}
//			}
//			}
//	int[]dupes=new int[duplicates.size()];
//	int i=0;
//			
//	for(int e:duplicates) {
//		dupes[i++]=e;
//	}
//	
//	return dupes;
	Set<Integer> dupes=new HashSet<Integer>();
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				dupes.add(arr[i]);
			}
			
		}
		
	}
	int[]result=new int[dupes.size()];
	int i=0;
	for(int e:dupes) {
		result[i++]=e;
	}
	return result;
}

}

