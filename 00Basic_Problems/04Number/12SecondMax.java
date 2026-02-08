import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = sc.nextInt();
	    
	    if(num == 0) {
	        System.out.print("not found");
	    }
	    
	    num = (int) Math.abs(num);  // handle negative numbers
	    
	    int max = -1;
	    int secondMax = -1;
	    
	    while(num != 0) {
	        int digit = num % 10;
	        if(max < digit) {
	            secondMax = max;
	            max = digit;
	        }
	        else if(max > digit && secondMax < digit) {
	            secondMax = digit;
	        }
	        num /= 10;
	    }
	    
	    if(secondMax == -1) System.out.print("not found"); // 0-9 and 666 or 777
	    else System.out.print("secondMax: "+secondMax);
	    
	}
}
