package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exapmle {
	
	public static void main(String[] args) {

		int[]num= {12,43,14,1,44,2,7,4,234,233,2};
		//getting the value of the array size to declare an empty array
		int l=num.length-1;
		//creating empty array with a length
		int[]result=new int[l];
//setting the index value has 0
		int index=0;
		
		for(int i=0;i<l;i++) {
			
			if(num[i]>100) {
				result[index++]=num[i];
			}
		}for(int i=0;i<l;i++) {
			
			if(num[i]>10&&num[i]<=99) {
				result[index++]=num[i];
			}
		}
for(int i=0;i<l;i++) {
			
			if(num[i]<10) {
				result[index++]=num[i];
			}
}
for(int i=0;i<result.length-1;i++) {
	for (int j = 0; j < result.length-1-i; j++) {
		
	
	if(result[i]>result[j]) {
		
//	int temp=result[i];
//	result[i-1]=result[i];
//	result[i]=temp;
		
		int temp=result[j];
		result[j]=result[j+1];
		result[j+1]=temp;
		
}
	}
}
//if(arry[i]>10){
//	int temp=arry[i];
//arry[i-1]=arry[i];
//arry[i]=temp;
//}
	/*
	 
int[] arry={1,20,3,40,5,50,6,70,8,80,9};

int n=arry.length-1;
//finding the lenth of the array to decleare an empty array with a size 
int[]result=new int[n];
//empty array created 
int index=0;
//setting the array index velue has 0
for(int i=0;i<arry.length-1;i++) {
	if(arry[i]>10) {
		result[index++]=arry[i];
		
	}
	
}
for(int i=0;i<arry.length-1;i++) {
	if(arry[i]<10) {
		result[index++]=arry[i];
	}  
	 */

for(int a:result) {
	System.out.print(a+" ");
}
	}

}
