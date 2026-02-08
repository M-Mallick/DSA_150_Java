public class Main {
	public static void main(String[] args) {
	    // reverse all digits in a number
	    int num = 1234;
	    int rev = 0;
	    while(num != 0) {
	        int digit = num % 10;
	        rev = rev * 10 + digit;
	        num /= 10;
	    }
		  System.out.println("Rverse Digit : "+rev);
	}
}
