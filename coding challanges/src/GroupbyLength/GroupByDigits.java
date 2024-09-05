package GroupbyLength;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDigits {

	public static void main(String[] args) {

		List<Integer> num=Arrays.asList(12,134,12,3,1234,5,12,354,23,24,5,134,34,1,3242,234);
		List<String> str=Arrays.asList("qwd","wdfcsxa","ad","dadsd","w");
		
		Map<String,Long> cata= str.stream().collect(Collectors.groupingBy(GroupByDigits::catagory,Collectors.counting()));
		Map<String, Long> collect = num.stream().collect(Collectors.groupingBy(GroupByDigits::catagory,Collectors.counting()));
	
		System.out.println(collect);
		System.out.println(cata);
	}
	private static String catagory(int num) {
		
		int l = String.valueOf(num).length();
		if (l==1) {
			return "1 digit";
		} else if(l==2) {
			return "2 digits";

		}else if(l==3) {
			return "3 digits";

		}else {
			return "more than 3 digits";

		}
		
		
	}private static String catagory(String name) {
		
		int l = name.length();
		if (l==1) {
			return "1 char";
		} else if(l==2) {
			return "2 chars";

		}else if(l==3) {
			return "3 chars";

		}else {
			return "more than 3 chars";

		}
}
	}
