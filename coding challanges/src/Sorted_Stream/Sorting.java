package Sorted_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String[] args) {
		Sorting sort=new Sorting();
		
		sort.numSort();
		sort.stringSort();
	}

	public void numSort() {
		List<Integer> nums=Arrays.asList(2,4,1,54,23,46,23434,5672,354364,3235,345,2,24,65);
		List<Integer> ascending = nums.stream().sorted().collect(Collectors.toList());
		
		Optional<Integer> min = nums.stream().min((val,val1)->{return val.compareTo(val1);});
		Integer integer = min.get();
		System.out.println(ascending);
	List<Integer> descending = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
	Object[] array = descending.toArray();
	
	System.out.println(descending); 
	System.out.println(array[2]); 
	
	nums.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.println(e));
	}
	public void stringSort() {
		
		List<String>names=Arrays.asList("jhon","baskar","andrew","lilly","stieve","phill","madeson");
		List<String> ascending = names.stream().sorted().collect(Collectors.toList());
		List<String> descending= names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(ascending);
		System.out.println(descending);
		Object[] array = descending.toArray();
		System.out.println(array[3]);
	}
}
