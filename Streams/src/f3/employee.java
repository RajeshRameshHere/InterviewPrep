package f3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class employee {
	int id;
	String name;
	String skill;
	int salary;
	int experiance;
	
	
	employee(int id,String name, String skill,int salary,int experiance){
		this.id=id;
		this.name=name;
		this.skill=skill;
		this.salary=salary;
		this.experiance=experiance;
		

		
	}
	public static void main(String[] args) {
		List<employee> employeeList= new ArrayList<employee>();
		employeeList.add(new employee(1, "raju", "java", 26000, 4));
		employeeList.add(new employee(23, "ramu", ".net", 27000, 14));
		employeeList.add(new employee(16, "ravi", "spring", 25000, 2));
		employeeList.add(new employee(1754, "ragu", "react", 30000, 7));
		employeeList.add(new employee(231, "rahul", "c++", 45000, 34));

		List<employee> exp_emp = employeeList.stream().filter(e->e.experiance>10).collect(Collectors.toList());
		 employeeList.stream().filter(e->e.experiance>4).forEach(e->System.out.println(e.salary));
		 exp_emp.forEach(e->System.out.println("name of the employee:"+e.name));
		 exp_emp.forEach(e->System.out.println(" and Skill:"+e.skill));
	}
	
	

}

