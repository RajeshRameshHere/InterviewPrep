package ReverseString;

import java.util.ArrayList;
import java.util.List;

public class ReverseGivenString {
	/*
	 StringBuilder result=new StringBuilder(s);
		int index=0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				
				result.setCharAt(i,letters.charAt(index++));
			}
			
		}
		return result.toString();
	}
	
	 */
	
	public static String reverseStr(String str) {
				StringBuilder letters=new StringBuilder();
				for(char c:str.toCharArray()) {
					if (Character.isLetter(c)) {
						letters.append(c);
					}
					
				}
		 letters.reverse();
		 System.out.println(letters);
		 StringBuilder result=new StringBuilder(str);
			int index=0;
			for (int i = 0; i < str.length(); i++) {
				if (Character.isLetter(str.charAt(i))) {
					
					result.setCharAt(i,letters.charAt(index++));
				}
				
			}
			return result.toString();
	}
	

	public static void main(String[] args) {
		String name="dechwu6426423@#@#jdfjufh";
		StringBuffer q=new StringBuffer(name);
		System.out.println("original:"+name);
		System.out.println("reversed:"+reverseStr(name));
		
		String result="";
		
		for(int i=name.length()-1;i>=0;i--) {
			result=result+name.charAt(i);
		}
	System.out.println(result);
//		System.out.println("revesring number:"+reverseNumber(name));
		
	}
	

//	public static String reverseString(String arr){
//		
//		StringBuilder letters=new StringBuilder();
//		for (char c:arr.toCharArray()) {
//			if (Character.isLetter(c)) {
//				
//				letters.append(c);
//							}
//					}
//	 letters.reverse();
//		StringBuilder result=new StringBuilder(arr);
//		int letterIndex=0;
//		for (int i = 0; i < arr.length(); i++) {
//			if (Character.isLetter(arr.charAt(i))) {
//				
//				result.setCharAt(i,letters.charAt(letterIndex++));
//			}
//			
//		}
//	
//		
//		
//		return result.toString();
//		
//	}
//	public static String rs(String s) {
//		
//		StringBuilder letters=new StringBuilder();
//		
//		for (char c:s.toCharArray()) {
//			if (Character.isLetter(c)) {
//				letters.append(c);
//					}
//				}	
//		letters.reverse();
//		StringBuilder result=new StringBuilder(s);
//	int	stringIndex=0;
//		
//	for (int i = 0; i < s.length(); i++) {
//		if (Character.isLetter(s.charAt(i))) {
//			result.setCharAt(i,letters.charAt(stringIndex++));
//		}
//	}
//		return result.toString();
//	}
//	
	public static String reverse(String s) {
		StringBuilder letters= new StringBuilder();
		for(char c:s.toCharArray()) {
			letters.append(c);
		}
		System.out.println(letters);
		letters.reverse();
		System.out.println(letters);
		StringBuilder result=new StringBuilder(s);
		int index=0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				
				result.setCharAt(i,letters.charAt(index++));
			}
			
		}
		return result.toString();
	}
	
	public static String reverseNumber(String s) {
		StringBuffer letters= new StringBuffer();
		for(char c:s.toCharArray()) {
			if (Character.isDigit(c)) {
				
			
			letters.append(c);}
		}
		System.out.println(letters);

		letters.reverse();
		System.out.println(letters);

		StringBuffer result=new StringBuffer(s);
		int index=0;
		
		for(int i=0;i<result.length();i++) {
			
			if (Character.isDigit(result.charAt(i))) {
				result.setCharAt(i,letters.charAt(index++));
				
			}
		}
		
		return result.toString();
	}
}
