package palindrom;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import GroupbyLength.GroupByDigits;

public class palindrom {
	
	
	
	public static void main(String[] args) {

		List<String>str=Arrays.asList("soS","maDam","lOl","hgscy","se");
		

		List<String> collect = str.stream().map(e->e.toLowerCase()).collect(Collectors.toList());

		
		for(String s:collect) {
		
			
			StringBuffer a=new StringBuffer(s);
			StringBuffer b=new StringBuffer(s).reverse();
			if (a.toString().equals(b.toString())) {
				System.out.println(s+":is palindrom");
				
			}
			else {
				System.out.println(s+":is not palindrom");
			}
		}
		
		palindromNumber(123421);
		
		int [] numbers= {12,43,121,434,54645,67876,23432,54684};
		
		for(int n:numbers) {
			
			if(n!=0) {
				palindromNumber(n);
			}
		}
	}
	
	
	
	public static void palindromNumber(int num){
		 int original=num;
		int rev=0;
		while(num!=0) {
		
			rev=rev*10+num%10;
			num/=10;
		}
		if(rev==original) {
			System.out.println("given number is palindrom "+original);
		}else {
			System.out.println("given number is not a  palindrom "+original);
		}
	}
	
}
