/*
	Problem Statement: Reverse a number
	File Name: 02Reverse.java
*/
import java.util.Scanner;
class Reverse {
	private static int reverse(int num) {
		int rev = 0;
		while(num != 0) {
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num /= 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		int rev = reverse(num);
		System.out.print("Reverse of given number: "+rev);
	}
} 