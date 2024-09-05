package flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Students {
	
	String name;
	int student_id;
	String grade;
	
	
	Students(String name,int student_id, String grade){
		this.name=name;
		this.student_id=student_id;
		this.grade=grade;
		
		
	}
	public static void main(String[] args) {
		
		List<Students> studentList=new ArrayList<Students>();
		
		studentList.add(new Students("raju", 101, "A"));
		studentList.add(		new Students("ravi", 1301, "B"));
		 
		List <Students> studentList2=Arrays.asList(new Students("ragu", 1031, "c"),
												new Students("rahul", 1021, "d"));
		List <List<Students>> allStudents=Arrays.asList(studentList,studentList2);

	//Before java 8
	
	for(List<Students> stu:allStudents) {
		for(Students st:stu) {
			System.out.println(st.name); 
		}	
	}
	
	
	//Stream concepts
	List<String> collected = allStudents.stream().flatMap(s->s.stream()).map(s->s.name).collect(Collectors.toList());
	
	System.out.println(collected);
}
	}