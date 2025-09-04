/*
	Problem Statement: Count of Prime Numbers till N
	File Name: 09CountPrime.java
*/
import java.util.Scanner;
class CountPrime {
	private static boolean prime(int num) {
		if(num < 2) return false;  // 0 and 1 are not prime
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	private static int countPrime(int start, int end) {
		int count = 0;
		for(int i=start; i<=end; i++) {
			if(prime(i)) count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int countPrime = countPrime(start,end);
		System.out.print("Total number of Prime number: "+countPrime);
	}
} 