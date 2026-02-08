import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = sc.nextInt();
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    
	    while(num != 0) {
	        int digit = num % 10;
	        if(max < digit) max = digit;
	        if(min > digit) min = digit;
	        num /= 10;
	    }
	    
	    System.out.print("max : "+max+", min : "+min);
	    
	}
}
