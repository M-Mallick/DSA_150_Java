/*
	Problem Statement: Count all Digits of a Number
	File Name: 00Count.java
*/
import java.util.Scanner;
class Count {
	private static int countDigit(int num) {
		int count = 0;
		while(num != 0) {
			num /= 10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		int count = countDigit(num);
		System.out.print("Total number of digit: "+count);
	}
} 
