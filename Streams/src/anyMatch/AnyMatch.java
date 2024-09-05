package anyMatch;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AnyMatch {
	public static void main(String[] args) {
		
		Set<String> fruits= new HashSet<String>();
		
		fruits.add("oNe apple");
		fruits.add("two banana");
		fruits.add("three orange");
		fruits.add("onE garpe");
		fruits.add("three pomogranate");
		fruits.add("one corn");
		fruits.add("five cherry");
		boolean one = fruits.stream().map(val->val.toLowerCase()).anyMatch(val->{return val.startsWith("one");});
		System.out.println(one);
		if (one==true) {
			List<String> collect = fruits.stream().map(val->val.toLowerCase()).filter(val->val.contains("one")).collect(Collectors.toList());
			System.out.println(collect);
		}
		else {
			System.out.println("no elements contains one");
		}
	}

}
