package sum_array;

import java.util.Arrays;

public class sum {
	public static void main(String[] args) {
		int[] arr= {123,1324,1,3,1234,142,12,13434,4,3212,134	};
		int sum = 0;
	
//	for(int i=0;i<arr.length;i++) {
//		
//		sum+=arr[i];
		
		//Alternative method for for loop arg
		
for(int i:arr) {
	sum+=i;
	}System.out.println(sum);
	
	int sum2 = Arrays.stream(arr).sum();
	
	System.out.println(sum2);
	}
	}
	
	

