package exampl1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class interview {
	
	public static int[]sortedAraay(int[]num){
		
		int l=num.length-1;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j <l-i; j++) {
			if (num[j]<num[j+1]) {
				
				
				int temp=num[j];
				num[j]=num[j+1];
				num[j+1]=temp;
			}}
		}
		
		return num;
	}
	public static Set<Integer> distinctAraay(int[]num){
		int l=num.length-1;
		Set<Integer>distinct=new HashSet<Integer>();
		Set<Integer>distinctRemoved=new HashSet<Integer>();
		
		for (int e:num) {
			
			if (!distinct.add(e)) {
				distinctRemoved.add(e);
			}
		}

		
		return distinctRemoved;
	}
	

	public static void main(String[] args) {
		//sample_dataset = [4,6,7,1,6,5,4,1,9,0,3,4]
		int[] s = {4,6,7,1,6,5,4,1,9,0,3,4};
			
		int[] sortedAraay = sortedAraay(s);
		System.out.println(distinctAraay(sortedAraay));
		
		for(int e:s) {
			System.out.print(e+" ");
		}
		
		Set<Integer>num=new HashSet<Integer>();
		Set<Integer>r=new HashSet<Integer>();

		distinctAraay(s);
		
		for(int e:s) {
			
			if(!num.add(e)) {
				r.add(e);
			}
		}
//		System.out.println(r);
//		for(int m:r) {
//		System.out.println(m);}
	}
	
	}

//List<Integer>num=Arrays.asList(4,6,7,1,6,5,4,1,9,0,3,4);
//List<Integer>result=new ArrayList<Integer>();
////result= num.stream().sorted().collect(Collectors.toList());
//
//
//int n=s.length-1;
//int r[]=new int[n];
//
//for(int i=0;i<s.length-1;i++) {
//for (int j = 1; j < s.length-1; j++) {
//
//if(s[i]==s[j]) {
//result.add(s[i]);
//}
//}
//}
//for(int e:result) {
//System.out.println(e);
//}
