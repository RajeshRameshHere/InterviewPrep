package hashSet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import ArrayList.arrayList;

public class HashSetConcept {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
	
		hs.add(1);
		hs.add(2);
		hs.add(5);
		hs.add(3);
		hs.add("wejifno");
		hs.add(8);
		System.out.println(hs);
		hs.remove("wejifno");
		System.out.println(hs);

		
HashSet<Integer> hset=new HashSet<Integer>();
hset.add(2);
hset.add(342);
hset.add(2452);
hset.add(2234);
hset.add(213435);
hset.add(21243);
for (Object h:hset) {
	System.out.println(h);
}

System.out.println(hset);
Object[] array = hset.toArray();

 List<Integer> num=new ArrayList<Integer>();
 
 for (Object a:array) {
	 
	 num.add((Integer) a);
	
}
 
 Collections.sort(num);
 
 System.out.println(num);
 Collections.reverse(num);
 System.out.println(num);

	}
}
