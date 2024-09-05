package reverseNmber;

import java.util.Arrays;
import java.util.Scanner;

class ReverseNumber {
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		
		String num1 = String.valueOf(num);
		
		//12345	
//	int reverse=0;
//	while(num!=0) {
//		reverse=reverse*10+num%10;
//		num/=10;
//		
//	}
//		System.out.println(reverse);

	
	StringBuffer rev=new StringBuffer(num1);
	
	 rev.reverse();
	System.out.println(rev);
	
	String content = rev.toString();
	 Integer.parseInt(content);
System.out.println(content);
	String[] split = content.split("");
	System.out.println(Arrays.toString(split));
	
	int n=0;
	for(String c:split) {
		try {
			n=n*10+Integer.parseInt(c);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	System.out.println(n);
	}
}

/*
 * while(num!=0) {
			reverse=reverse*10+num%10;
			num/=10;
		}
		System.out.println(reverse);
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * StringBuffer rev=new StringBuffer(num);
rev.reverse();
String string = rev.toString();
try {

	int p=Integer.parseInt(string);
	
	
	System.out.println(p);
} catch (Exception e) {
System.out.println("an exception");}
*/
