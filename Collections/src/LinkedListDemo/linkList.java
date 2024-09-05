package LinkedListDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkList {
	
	//Linked List works same as arrayList but it wont give indexing
	//in link list data is connected by the previous and next object combined like a node
	//each element has nodes to direct the elements related to it
	
	//duplicates are allowed
	//input ordering is preserved
	//indexing is not allowed
	
	//best to use when the operations are high
	//avoid using when there is more number of retrievals
	
	
	
	
	public static void main(String[] args) {
		
		//syntax
		
		LinkedList link= new LinkedList();	
		
		link.add("its a link");
		link.add(22);
		link.add(true);
		link.add(2.544);
		System.out.println(link);
		
		LinkedList<String> str= new LinkedList<String>();
		str.add("welcome");
		
		String[] names= {"raju","ragu","romeo","robart","rogger"};
		
		Collections.addAll(str, names);
		System.out.println(str);
		
		for (int i = 0; i < str.size()-1; i++) {
			
			System.out.println(str.get(i));
			
		}
		
		
	}

}
