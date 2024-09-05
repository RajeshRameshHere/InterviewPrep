package reverseArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class targetReverse {

public static void main(String[] args) {
	
    ArrayList<Integer> array= new ArrayList<Integer>();
    array.add(1);
    array.add(4);
    array.add(7);
    array.add(3);
    array.add(5);
    array.add(18);
    array.add(12);
    array.add(1232);
    
	reverseArray(array, 5);
	System.out.println(array);
}

    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
    	ArrayList<Integer> rev=new ArrayList<Integer>();
        
    	boolean ele=false;
    	
    	for(int a:arr) {
    		if(a==m) {
    			ele=true;
    		}
    		if(ele) {
    			rev.add(a);
    		}
    		
    	}
    	Collections.reverse(rev);
    	ArrayList<Integer>result=new ArrayList<Integer>(arr);        
    	 int index=0;
    for(int i=0;i<result.size()-1;i++) {
    	
    	if(i==m) {
    		result.set(i,index++);
    		
    	}
    }
    System.out.println(result);
    }  // Write your code here.
    }
