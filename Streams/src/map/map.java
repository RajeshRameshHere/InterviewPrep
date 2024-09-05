package map;

import java.util.Optional;

public class map {
	public static void main(String[] args) {
        int number = 153; // Example number to check
        
    boolean armStringNumber = isArmStringNumber(number);
System.out.println(armStringNumber);
	
    
    if (armStringNumber) {
    	System.out.println("the given number " + number+" is armstrong");
		
	}
    else {
		System.out.println("it is not a armstrong number");
	}
    Optional<String > test =   Optional.empty();
    if (!test.isPresent()) {
        System.out.println("it is  empty");

	} 
}
	
	 public static  boolean isArmStringNumber(int number) {
	    	int digits=number;
	    	int power = String.valueOf(digits).length();
	    	int sum=0;
	    	
	    	while (number!=0) {
	    		

	    		int reminder=number%10;

		    	System.out.println(reminder);

	    		sum+=Math.pow(reminder, power);
		    	System.out.println(number);

	    		number/=10;
	    		
				
			}
	    	System.out.println(number);
	    	return sum==digits;
	    	
	    	
	    }
    
   
    	
    }



