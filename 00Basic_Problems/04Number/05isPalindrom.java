import java.util.*;
public class Main {
    private static int reverse(int n) {
        int rev = 0;
        while(n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
    private static boolean isPalindrome(int i) {
        if(i < 0) return false; //  A negative number cannot be a palindrome
        if(i < 10) return true;
        return i == reverse(i);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter start: ");
	    int start = sc.nextInt();
	    System.out.print("\nEnter end: ");
	    int end = sc.nextInt();
	    for(int i = start; i <= end; i++) {
	        if(isPalindrome(i)) {
	            System.out.print(" "+i);
	        }
	    }
	}
}
