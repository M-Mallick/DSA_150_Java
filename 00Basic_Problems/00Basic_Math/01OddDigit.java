/*
	Problem Statement: Count number of odd digits in a number
	File Name: 01OddDigit.java
*/
import java.util.Scanner;
class OddDigit {
	private static int countOddDigit(int num) {
		int count = 0;
		while(num != 0) {
			int rem = num % 10;
			if(rem%2 != 0) {
				count++;
			}
			num /= 10;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		int countOddDigit = countOddDigit(num);
		System.out.print("Total number of odd digit: "+countOddDigit);
	}
} 