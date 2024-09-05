package find_max_array;

import java.util.Arrays;
import java.util.Iterator;

public class max {
    public static void main(String[] args) {
		int arr[]= {785314,134,2,323,432,1,1,4143,123,4,21134};
		
		int max=arr[0];
		
		//Iteration
		for (int n:arr) {
			if(n>max) {
				max=arr[n];
			}
		}
		
		//stream
		int maximum = Arrays.stream(arr).max().getAsInt();
		System.out.println(maximum);
		
		
		
		System.out.println(max);

	}
}
