package parelleltream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class filterStudent {
	

	
	public static void main(String[] args) {
		List<Student> student=Arrays.asList(
				new Student("jhon", 78),
				new Student("smith", 67),
				new Student("jerry", 80),
				new Student("rhino", 89),
				new Student("bob", 70),
				new Student("trump", 97),
				new Student("donald", 56)
				
				);
		
		List<String> result = student.parallelStream()
				.filter(e->e.getMarks()>=70).
				limit(3).
				map(e->e.getName()+"="+e.getMarks()).collect(Collectors.toList());
System.out.println(result);

student.stream().parallel().filter(e->e.getMarks()>=70).limit(3).forEach(e->System.out.println(e.getName()+" "+e.getMarks()));

int[] arr=new int[5] ;
arr[0]=1; 
arr[1]=341; 
arr[2]=231; 
arr[3]=145; 
arr[4]=2451; 

List<Integer>array1=Arrays.stream(arr).boxed().collect(Collectors.toList());
System.out.println(array1);

for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}
List<Integer>array=new ArrayList<Integer>();
for (int j = 0; j < arr.length; j++) {
	array.add(arr[j]);
	
}
System.out.println(array);

array.sort((a, b) -> Integer.compare(b,a));
System.out.println(array);

	}
	
}
//IntStream.of(arr).boxed().collect(Collectors.toList());