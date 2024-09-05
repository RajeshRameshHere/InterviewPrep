package map_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class map_add {
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers=Arrays.asList(21,43,123,443,156,3,1245,123352);
		
		List<Integer> mathing=new ArrayList<Integer>();
		List<Integer> mathing1=new ArrayList<Integer>();
		List<Integer> mathing3=new ArrayList<Integer>();

		
//		approach 1:
		
		for(int n:numbers) {
			
			mathing1.add(n+20000); 
		}
	System.out.println(mathing1);
	
	for(int i=6;i<numbers.size();i++) {
		
		int num=numbers.get(i);
		
	mathing3.add(num+20000000);
	}
	System.out.println(mathing3);
//	approach 2:

		mathing=numbers.stream().map(n->n+10000).collect(Collectors.toList());
		
		numbers.stream().map(n->n+30000).forEach(System.out::println);
	
		System.out.println(mathing);
	}

}
