package nthheighstSalary;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Employee {
	
	public static void main(String[] args) {
		Map<String, Integer>employee=new HashMap<String, Integer>();
		employee.put("Raju", 1000);
		employee.put("ramesh", 2000);
		employee.put("hari", 3000);
		employee.put("bhavi", 4000);
		employee.put("manjula", 5000);
		employee.put("jytohi", 5000);
		employee.put("ishu", 6000);
		employee.put("chinu", 6000);
		employee.put("chiti", 7000);
		
		Entry<Integer, List<String>> findNthValue = findNthValue(employee, 2);
		System.out.println(findNthValue);
 
	} 

	public static Entry<Integer, List<String>> findNthValue(Map<String, Integer> emp,int num){
		Entry<Integer, List<String>> entry = emp.entrySet().stream().
				collect(Collectors.groupingBy(Map.Entry::getValue,
						Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
						.entrySet().stream()
						.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
						.collect(Collectors.toList()).get(num-1);
		return entry;
	}
}
