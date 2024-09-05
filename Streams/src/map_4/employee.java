package map_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class employee {
	
	String  name;
	int salary;
	int experience;
	String department;
	
	employee(String name,int salary,int experience,String department){
		
		this.name= name;
		this.salary=salary;
		this.experience=experience;
		this.department=department;
		
	}
	
	public static void main(String[] args) {
		
		List<employee> selected=Arrays.asList
				(new employee("raju",10000,2,"enginnering"),
				new employee("ramu",100000,5,"business"),
				new employee("ragu",21000,7,"analyst"),
				new employee("ravi",10700,9,"enginnering"),
				new employee("reddy",120000,8,"enginnering"),
				new employee("rahul",19000,12,"enginnering"));
		 
		List<String> hike = selected.stream()
                .filter(e -> e.experience > 7)
                .map(e -> e.name + ": " + (e.salary + 2)) // Multiply salary by 2 (as an example)
                .collect(Collectors.toList());
	
	System.out.println(hike);
	}

}

