package List;

import java.util.ArrayList;
import java.util.List;

public class listCollection {


public static void main(String[] args) {
	

List<Integer> num=new ArrayList<Integer>();
num.add(1);
num.add(1);

num.add(1, 76);

System.out.println(num.get(1));
System.out.println(num.set(2, 24452));
System.out.println(num);

}
}