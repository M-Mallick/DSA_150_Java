import java.util.*;
public class Main {
    private static boolean armstrong (int num) {
        if(num < 1) return false;
        int count = (int) Math.log10(num) + 1;
        int sum = 0;
        int n = num;
        while(n != 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit,count);
            n /= 10;
        }
        return num == sum;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = sc.nextInt();
	    System.out.println(num+" is a amrstrong: "+armstrong(num));
	    
	}
}
