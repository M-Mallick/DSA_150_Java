import java.util.*;
public class Main {
    private static boolean perfect (int num) {    // 6 ( 1 + 2 + 3 )
        if(num < 1) return false;
        int sum = 0;
        for(int i = 1; i < num; i++) {   // optimized: i * i <= num
            if(num % i == 0) {
                sum += i;
            }
        }
        return num == sum;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = sc.nextInt();
	    System.out.println(num+" is a perfect: "+perfect(num));
	    
	}
}
