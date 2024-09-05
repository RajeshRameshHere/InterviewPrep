package map_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Names {
	
	public static void main(String[] args) {
		List<String> names=Arrays.asList("raju","ramesh","harish","prathap","harshita" );
		
		List<Integer> size=new ArrayList<>();
		List<Integer> length=new ArrayList<>();
		List<Integer> size1=new ArrayList<>();

		
//		approach 1:
		
		for(int i=0;i<names.size();i++) {
			String name=names.get(i);
			length.add(name.length()) ;
		}
		System.out.println(length);
		
//		approach 2:

		for(String n:names) {
			size1.add(n.length()) ;
		}
		System.out.println(size1);
		
		
//		approach 3:

		size=names.stream().map(n->n.length()).collect(Collectors.toList());
		
		System.out.println(size);
		
		names.stream().map(n->n.length()).forEach(System.out::println);
		
	}

}
