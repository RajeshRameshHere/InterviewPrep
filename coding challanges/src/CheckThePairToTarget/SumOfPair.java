package CheckThePairToTarget;

public class SumOfPair {
	
	
	
	public static void main(String[] args) {
		int []arr= {2,4,14,3,2,8,20,40,12,3,32,1,6,24};
			int target=34;
		checkNumberTarget(arr, target);
	}

	public static void checkNumberTarget(int[] number,int target) {
	
	int[] trailNumber=number;
	int check=target;
	boolean status=false;
	
	 for(int i=0;i<trailNumber.length;i++) {
		 for(int j=i+1;j<trailNumber.length;j++) {
			 
			 if(trailNumber[i]+trailNumber[j]==target) {
				 System.out.println("matched numbers:"+ trailNumber[i]+","+trailNumber[j]);
				  status=true;
			 }
			 
		 }
		
		 
	 }
	 if (!status) {
		 System.out.println("no match found");
		
	}
	 }
	}
	
//	int[]test= {1,2,3,4,5};
//int target=7;

//checkTarget(test, target);
//public static void checkTarget(int[] arr,int target) {
//		
//		int[] array=arr;
//		int setTarget=target;
//		boolean foundmatch=false;
//		
//		for (int i = 0; i < array.length; i++) {
//			for (int j =i+1; j < array.length; j++) {
//				
//				if (array[i]+array[j]==setTarget) {
//					System.out.println(array[i]+","+array[j]);
//					foundmatch=true;
//				}
//			}
//			
//		}
//		if (!foundmatch) {
//			System.out.println("no match found!!");
//			
//		}
//		