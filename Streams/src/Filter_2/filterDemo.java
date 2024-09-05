package Filter_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class filterDemo {
	public static void main(String[] args) {
		
		List<String>words=Arrays.asList("Raju","Ramesh","captain","extendable");
		List<String> result= new ArrayList<String>();
		
		result=words.stream().filter(n->n.length()>=4 && n.length()<8).collect(Collectors.toList());
		List<String>result2=words.stream().filter(n->n.toLowerCase().startsWith("r")).collect(Collectors.toList());

		System.out.println(result);
		System.out.println("names that starts with letter R"+result2);

	List<String> box=Arrays.asList("sweet","fruit",null,"tools",null," ","lunch","black");	
	
	List<String>filetred= box.stream().filter(b->b!=null &&b.length()>1&&b.toLowerCase().startsWith("t")).collect(Collectors.toList());
	box.stream().filter(b->b!=null &&b.length()>1).forEach(System.out::println);

	System.out.println(filetred);
	System.out.println("boxes that starts with letter t"+filetred);

	
	
	}

}
