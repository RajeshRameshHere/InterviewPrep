package Filter_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter_demo {

	public static void main(String[] args) {
		
		//without streams
		
	/*	ArrayList<Integer> numberList=new ArrayList<>();
		numberList.add(12);
		numberList.add(24);
		numberList.add(17); 
		numberList.add(55);
		numberList.add(198);
		numberList.add(72);
		numberList.add(133);

		ArrayList<Integer> EvenNmber=new ArrayList<>();
		

		for(int num:numberList) {
		if (num%2==0) {
			EvenNmber.add(num);
		
		}	}		System.out.println(EvenNmber);*/

//		with streams
		
		List<Integer> NumberList=Arrays.asList(12,22,31,344,54321,134,1245,1794);
		List<Integer>EvenNumber=new ArrayList<>();
		
		//adding the collection to the stream
		
	EvenNumber=	NumberList.stream().
		
		//Choosing the method to perform
		filter(n->n%2==0).
		
		//saving into the collection of a temp collection 
		collect(Collectors.toList()); //here collectors helps to store in the list which is temp file
		
//further we can store the collection in the created empty arrayList of EvenNumber by assignig the statment to it
	
System.out.println(EvenNumber);

// in one line the statment looks like this
EvenNumber=NumberList.stream().filter(num->num%2==0).collect(Collectors.toList());

// to directly print without saving we can use this
NumberList.stream().filter(nu->nu%2==0).forEach(nu->System.out.print(nu+","));
NumberList.stream().filter(nu->nu%2==0).forEach(System.out::println);

List<Integer> numb=Arrays.asList(21,434,445,124,462356,23532,145);
List<Integer>grater=numb.stream().filter(e->e>99).collect(Collectors.toList());

System.out.println(grater);
}
	
}
