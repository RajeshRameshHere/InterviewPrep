package distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo {
	
	
	public static void main(String[] args) {
	
		
					//Distinct
// 					----------
		// Distinct method is used to delete duplicate methods in the list or collection
		//it is a non terminal or intermediate method 
		// it doesn't take any parameter
		
		List<String> vehicals=Arrays.asList("car","bike","plane","car","bike","plane" );
		
		vehicals.stream().distinct().forEach(v->System.out.print(" " +v));
		List<String> collected = vehicals.stream().distinct().collect(Collectors.toList());	
		System.out.println(collected);
		
		
			//Count
//			----------
		//count is a ternary operator
		// helps to count the number of elements in it
		long count1 = vehicals.stream().distinct().count();

		
		long count = vehicals.stream().count();
		System.out.println(count);
		System.out.println(count1);

			//limit
//			----------
		//is used to limit the number of elements in the list of data or object 
		//non terminal method
		
		List<String> limited = vehicals.stream().limit(5).collect(Collectors.toList());
		vehicals.stream().limit(5).forEach(System.out::println);
		vehicals.stream().limit(5).forEach(v->System.out.println(v+"s"+","));

		
		System.out.println(limited);
		
	}

}
