package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class employeeMain {
	
	public static void main(String[] args) {
		ArrayList<employee> emp=new ArrayList<employee>();
		emp.add(new employee(134345, 24, "raju", "java","male"));
		emp.add(new employee(215223, 26, "ragu", "spring","male"));
		emp.add(new employee(33425, 29, "rani", "java","female"));
		emp.add(new employee(43254, 23, "riya", "sql","female"));

		//increment of salary whose age is grater than 25
		
		List<String> updated = emp.stream().filter(e->e.getAge()>25).map(e->e.getName()+":"+(e.getsalary()+1000000)).collect(Collectors.toList());
		emp.stream().filter(e->e.getAge()>25).map(e->e.getName()+":"+(e.getsalary()+1000000)).forEach(System.out::println);
	System.out.println(updated);
	
	//Filter the employee by gender and count it
	
	Map<String, Long> collected = emp.stream().collect(Collectors.groupingBy(employee::getGender,Collectors.counting()));
	System.out.println(collected);

	//Filter the employee by skill and gender and count it

	Map<String, Map<String, Long>> bySkill = emp.stream().
			collect(Collectors.groupingBy(employee::getSkill,Collectors.groupingBy(employee::getGender,Collectors. counting())));
	System.out.println( bySkill);
	
	//average by gender salary
	
	Map<String, Double> avg = emp.stream().collect(Collectors.groupingBy(employee::getGender,Collectors.averagingDouble(employee::getsalary)));
	System.out.println(avg);
	
	Map<String, Map<Integer, Long>> bySalary = emp.stream().collect(Collectors.groupingBy(employee::getGender,Collectors.groupingBy(employee::getsalary,Collectors.counting())));
	
	System.out.println(bySalary);
	
		Optional<Integer> min = emp.stream().map(e->e.getsalary()).min((a,b)->a.compareTo(b));
	
		System.out.println(min.get());
		
		Integer integer = emp.stream().map(e->e.getsalary()).max((x,y)->{return x.compareTo(y);}).get();
		System.out.println(integer);
		
		int length = String.valueOf(integer).length();
		System.out.println(length);
	}
	}


