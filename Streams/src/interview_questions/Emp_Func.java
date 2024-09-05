package interview_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import f3.employee;

public class Emp_Func {
	
	
	public static void main(String[] args) {
		
		List<Skills>skillRaju=new ArrayList<Skills>();
		skillRaju.add(new Skills("java",4));
		skillRaju.add(new Skills("spring",3));
		skillRaju.add(new Skills("hibernate",5));
		skillRaju.add(new Skills("mysql",4));
		List<Skills>skillhari=new ArrayList<Skills>();
		skillhari.add(new Skills("java",3));
		skillhari.add(new Skills("spring",2));
		skillhari.add(new Skills("hibernate",2));
		skillhari.add(new Skills("mysql",4));
		List<Skills>skillramu=new ArrayList<Skills>();
		skillramu.add(new Skills("java",1));
		skillramu.add(new Skills("spring",2));
		skillramu.add(new Skills("hibernate",3));
		skillramu.add(new Skills("mysql",2));
		List<Skills>skillsai=new ArrayList<Skills>();
		skillsai.add(new Skills("java",3));
		skillsai.add(new Skills("spring",1));
		skillsai.add(new Skills("hibernate",3));
		skillsai.add(new Skills("mysql",2));

		List<GroupEmployee>empBook=new ArrayList<GroupEmployee>();
		empBook.add(new GroupEmployee("raju","Backend-developer",800000.00,8838372027l,3,skillRaju));
		empBook.add(new GroupEmployee("ramu","Kafka-developer",900000.00,883894420l,3,skillramu));
		empBook.add(new GroupEmployee("hari","sql-developer",1000000.00,9787535216l,3,skillhari));
		empBook.add(new GroupEmployee("sai","fullstack-developer",60000.00,9626669447l,3,skillsai));
		
		List<GroupEmployee> descorder = empBook.stream().sorted((a, b) ->b.getDepartment()
				.compareToIgnoreCase(a.getDepartment()))
		.collect(Collectors.toList());
		
		empBook.sort(Comparator.comparing(GroupEmployee::getNumber));
		
		List<GroupEmployee> java3 = empBook.stream().filter(e->e.getSkills().stream()
				.anyMatch(s->"java"
				.equalsIgnoreCase(s.getSkill())&&s.getRate()>2))
				.collect(Collectors.toList());
		  
		for(GroupEmployee e:empBook)
		System.out.println(e.getName()+":"+e.getNumber());
		for(GroupEmployee e:descorder)
			System.out.println(e.getName()+":"+e.getDepartment());
		System.out.println();
		System.out.println("java skill above 3 rating");
		for(GroupEmployee e:java3)
			System.out.println(e.getName()+":"+e.getDepartment());

	}

}
//List<GroupEmployee> java3 = empBook.stream().filter(e->e.getSkills().stream()
//		.anyMatch(s->"java".equalsIgnoreCase(s.getSkill())&&s.getRate()>=3)).collect(Collectors.toList());
//