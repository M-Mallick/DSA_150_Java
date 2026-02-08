public class Main {
	public static void main(String[] args) {
	    // sum all digits in a number
	    
	    int num = 61;
	    int sum = 0;
	    while(num != 0) {
	        int digit = num % 10;
	        sum = sum + digit;
	        num /= 10;
	    }
		  System.out.println("Sum of Digit : "+sum);
	}
}
