package everyFirstLatterCap;

import java.util.ArrayList;
import java.util.List;

public class FirstCharCap {
	
	public static String[] firstCap(String str) {
		String[] split = str.split(" ");
		
		for(int i=0;i<split.length;i++) {
			//(split[i]=legend)=legend.(substring(0,1)=l).(toUppercase(l)=L).+split[legend].substring(1)=egend;
			//L + egend
			//Legend
			split[i]=//Legend
					split[i].substring(0, 1)//legend=>l
					.toUpperCase()			//L
					+						//+
					split[i].substring(1);	//legend=>egend
		}
		return split;
	}
	public static void main(String[] args) {
		String n="hey guys! welcome to the coding world!!";
		String[] firstCap = firstCap(n);
		
		for(String s:firstCap) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		String oneState = String.join("", firstCap);
		String replace = oneState.replace("!", "");
		System.out.println(oneState);
		System.out.println(replace);

	}
}
