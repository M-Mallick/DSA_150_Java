import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = sc.nextInt();
	    System.out.print("All the prime factors of "+num+" are: ");
	    for(int i = 2; i < num; i++) {  // O(n) -> O( _/n )i * i <= num
	        while(num % i == 0) {
	            System.out.print(i+" ");
	            num /= i;
	        }
	    }
	    
	    if(num > 1) System.out.print(num);
	    
	}
}
