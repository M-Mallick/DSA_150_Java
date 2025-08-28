/*
	Problem Statement: Return the Largest Digit in a Number
	File Name: 04MaxDigit.java
*/
import java.util.Scanner;
class MaxDigit {
	private static int maxDigit(int num) {
		int max = Integer.MIN_VALUE;
		while(num != 0) {
			int rem = num % 10;
			if(max < rem) {
				max = rem;
			}
			num /= 10;
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		int max = maxDigit(num);
		System.out.print("max: "+max);
	}
}