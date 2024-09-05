package apperanceCount;

import java.util.HashMap;
import java.util.Map;

public class CountAppearence {

	
	public static Map<Character,Integer>countApperance(String str){
		
		Map<Character,Integer>map=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(map.containsKey(c)) {
				int count=map.get(c);
				count++;
				map.replace(c,count);
			}else {
				map.put(c, 1);
			}
			
		}
		
		return map;
	}
	
	public static void main(String[] args) {
		Map<Character, Integer> countApperance = countApperance("aadhwhdnwjdnednisnwdhbferiyad");
	for(char s:countApperance.keySet()) {
		
		System.out.print(s+""+countApperance.get(s));
	}
	}
}
	/*
for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if (map.containsKey(c)) {
				int count=map.get(c);
				count++;
				map.replace(c, count);
			}else {
				map.put(c,1);
			}
		}
*/
