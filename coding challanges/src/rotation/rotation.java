package rotation;

import java.util.ArrayList;
import java.util.List;

public class rotation {
	
	public static List<Integer>rotateAtD(int arr[], int d){
		List<Integer>beforeD=new ArrayList<Integer>()	;
		List<Integer>afterD=new ArrayList<Integer>();
		
		int l = arr.length;
		boolean dFound=false;
		
		for (int i = 0; i < l; i++) {
			
			if(i==d) {
				dFound=true;
							}
			if(!dFound) {
				beforeD.add(arr[i]);
				
			}else {
				afterD.add(arr[i]);
			}
		}
		for(int i=beforeD.size()-1;i>=0;i--) {
			afterD.add(beforeD.get(i));
		}
		return afterD;
	}
	
	 static List<Integer> rotateArr(int arr[], int d, int n) {
	        // add your code here
	         List<Integer>beforeD=new ArrayList<Integer>();
	        List<Integer>afterD=new ArrayList<Integer>();
	        boolean foundD=false;
	        for(int i=0;i<n;i++){
	            if(i==d){
	                foundD=true;
	                            }
	        
	            if(!foundD){
	                beforeD.add(arr[i]);
	                
	            }else{
	                
	                afterD.add(arr[i]);
	            }
	        }
	        afterD.addAll(beforeD);
	        
	    
	 return afterD;
			 }
	 
	 static List<List<Integer>> rotateArr(int arr[], int d[]) {
		 int dl = d.length;
		 int al = arr.length;
		 List<List<Integer>>result=new ArrayList<List<Integer>>(); 
		 for(int i=0;i<dl;i++) {
			 
			 boolean foundD=false;
			 List<Integer>beforeD=new ArrayList<Integer>();
			 List<Integer>afterD=new ArrayList<Integer>();
			 
			 for(int j=0;j<al;j++) {
				 if(i==d[i]) {
					 foundD=true;
				 }
				 if(!foundD) {
					 beforeD.add(arr[i]);
				 }else {
					 afterD.add(arr[i]);
				 }
				 
				 }
			 afterD.addAll(beforeD);
			 result.add(afterD);
		 }
		 
	return result;
	}
		public static void main(String[] args) {
//			int arr[]= {12,423,224,35465,324435,2342,34,243,323};
//			int d=2;
//			int n=9;
//			List<Integer> rotateAtD = rotateAtD(arr, d);
//			System.out.println(rotateAtD);
//			List<Integer> rotateArr = rotateArr(arr, d, n);
//			System.out.println(rotateArr);
			int arr[]= {1,2,3,4,5};
			int d[]= {3,2};
			List<List<Integer>> rotateArr = rotateArr(arr, d);
			System.out.println(rotateArr);
		}
}

