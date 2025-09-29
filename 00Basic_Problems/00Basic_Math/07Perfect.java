/*
	Problem Statement: Check for Perfect Number
	File Name: 07Perfect.java
*/
import java.util.Scanner;
class Perfect {
	private static boolean perfect(int num) {
		int sum = 0;
		for(int i=1; i<num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return num == sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		boolean perfect = perfect(num);
		System.out.print(num+" is a Perfect: "+perfect);
	}

} 
