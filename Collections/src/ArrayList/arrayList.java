package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class arrayList {
	
	
	
	public static void main(String[] args) {
		
//		default declaration of arrayList
		
//		type1
		ArrayList num=new ArrayList();
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(1);
		num.add(5);
		num.add("raju");
		num.add(2.43);
		System.out.println(num);
		Object num1 = num.stream().distinct().collect(Collectors.toList());
		int size = num.size();
		System.out.println(num1);
		System.out.println(size);
		
		
//		type2
		
		List<Integer>numbers=Arrays.asList(1,234,45,32,543,62);

		numbers.sort((a,b)->{return a.compareTo(b);});

		System.out.println(numbers);

		numbers.sort((a,b)->{return b.compareTo(a);});
		System.out.println(numbers);
		
			Collections.shuffle(numbers);
			System.out.println(numbers);
		ArrayList<Integer>numbers1=new ArrayList<Integer>();
		ArrayList<Integer>numbers2=new ArrayList<Integer>();

		Collections.sort(numbers);
		System.out.println(numbers);
//		Collections.reverse(numbers);
		System.out.println("reverse order");
		Collections.sort(numbers,Collections.reverseOrder());
		System.out.println(numbers);


		Scanner scan=new Scanner(System.in);
		System.out.println("enter first digit");
		Integer a = scan.nextInt();
		System.out.println("enter second digit");
		Integer b = scan.nextInt();
System.out.println("sum of:"+a+"+"+b+"="+(a+b));
		

for(int i=0;i<=numbers.size()-1;i++) {
	System.out.println(numbers.get(i));
}
	
	for(Object e:numbers) {
		System.out.println(e);
	}
	}

}
