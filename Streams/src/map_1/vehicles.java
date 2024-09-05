package map_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class vehicles {
	public static void main(String[] args) {
		
		
		List<String> vehicles=Arrays.asList("ship","bike","train","bus","van","car","truck");
		
		List<String> capVehicles=new ArrayList<String>();
		List<String> upperCase=new ArrayList<String>();
		
//		before java 8

		for(String v:vehicles) {
			 upperCase.add(v.toUpperCase()) ;
		}
		System.out.println(upperCase);
		
//		after java 8

		//storing
		capVehicles=vehicles.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(capVehicles);

		//printing 
		vehicles.stream().map(e->e.toUpperCase()).forEach(System.out::println);
	}
	

}
