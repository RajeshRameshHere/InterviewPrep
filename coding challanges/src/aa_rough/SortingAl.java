package aa_rough;

import java.util.Iterator;

public class SortingAl {
	
	
	public static void main(String[] args) {
		
		int n=456765;
		System.out.println(reverseNumber(n));

		
		
		int arr[]= {1,3,5,-13,-44,234,2,12};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
			}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
	
	public static int reverseNumber(int num) {
		
		int result=0;
		
		while(num!=0) {
			int re=num%10;
			result=result*10+re;
			num/=10;
		}
		
		return result;
	}

}
