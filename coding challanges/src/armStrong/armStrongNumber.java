package armStrong;
public class armStrongNumber {

    public static void main(String[] args) {
        int number = 153; // Example number to check
        
    boolean armStringNumber = isArmStringNumber(number);
System.out.println("checking...");
	
    
    if (armStringNumber) {
    	System.out.println("the given" + number+"is armstrong");
		
	}
    else {
		System.out.println("it is not a armstrong number");
	}
    
}
    
    public static  boolean isArmStringNumber(int number) {
   	 
    	int digits=number;
    	int length = String.valueOf(digits).length();
    	int sum = 0;
    	while (digits!=0) {
    		int reminder=digits%10;
    		sum+=Math.pow(reminder, number);
			
		}
    	
    	
   	 return sum== digits;
    }
}