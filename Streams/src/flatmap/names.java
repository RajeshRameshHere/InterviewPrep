package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class names {

	public static void main(String[] args) {
		List<String> lst1=Arrays.asList("tom","jerry","spike" );
		List<String> lst2=Arrays.asList("ben","jwen","grandpa" );
		List<String> lst3=Arrays.asList("bean","cat","teddy" );
		List<String> lst4=Arrays.asList("bheem","raju","chutki" );
		
		List<List<String>> all=Arrays.asList(lst1,lst2,lst3,lst4);
		
		List<String> collected = all.stream().flatMap(a->a.stream()).collect(Collectors.toList());
		
System.out.println(collected);


List<String> l=Arrays.asList("car","bike","scooter","truck","van" );
List<String> l2=Arrays.asList("ship","sailor","yaht","boat","carrier" );
List<String> l3=Arrays.asList("jet","rocket","plane","air ship","shuttle" );

List<List<String>> allList=Arrays.asList(l,l2,l3);

List<String> as=allList.stream().flatMap(a->a.stream()).filter(s->s.contains("a")).collect(Collectors.toList());


System.out.println(as);
		
	}
}
