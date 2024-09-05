package min_max;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class demo {
	public static void main(String[] args) {
		
		/*
		 * min and max methods take compartive parameter
		 * it takes to values as arguments
		 * its in intermediate method
		 * Syntax follows as min((arg,arg)->{function to compare with return statement};)
		 * 
		 * */
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> min = nums.stream().min((val,val1)->{return val.compareTo(val1);});
		Integer  lowest= min.get();		
		System.out.println("minimum value is:"+lowest);
		
		Optional<Integer> max = nums.stream().max((i,j)->{
			return i.compareTo(j);});
		Integer maximum = max.get();
		System.out.println("maximum value is:"+maximum);
		
		List<Integer> num1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> num2=Arrays.asList(11,22,33,44,55,66,77,78,99,110);
		List<Integer> num3=Arrays.asList(12,23,34,45,56,67,78,89,90,101);
		List<Integer> num4=Arrays.asList(111,222,333,444,555,666,777,998,889,1000);

		List<List<Integer>> numbers=new ArrayList<List<Integer>>();
		numbers.add(num1);
		numbers.add(num2);
		numbers.add(num3);
		numbers.add(num4);
		
		
		Optional<Integer> max2 = numbers.stream().flatMap(e->e.stream()).max((i,j)->{
			return i.compareTo(j);});
		
System.out.println( max2.get());
		

		
		
		
		
	}

}
