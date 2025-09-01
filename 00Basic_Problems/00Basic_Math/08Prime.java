/*
	Problem Statement: Check for Prime Number
	File Name: 08Prime.java
*/
import java.util.Scanner;
class Prime {
	private static boolean prime(int num) {
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		boolean prime = prime(num);
		System.out.print(num+" is a prime: "+prime);
	}
} 