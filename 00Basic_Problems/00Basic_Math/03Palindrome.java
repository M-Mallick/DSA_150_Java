/*
	Problem Statement: Palindrome Number
	File Name: 03Palindrome.java
*/
import java.util.Scanner;
class Palindrome {
	private static int reverse(int num) {
		int rev = 0;
		while(num != 0) {
			int rem = num % 10;
			rev = (rev*10) + rem;
			num /= 10;
		}
		return rev;
	}
	private static boolean palindrome(int num) {
		return num == reverse(num);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		boolean palindrome = palindrome(num);
		System.out.print(num+" is a Palindrome: "+palindrome);
	}
}