/*
	Problem Statement: Factorial of a given number
	File Name: 05Factorial.java
*/
import java.util.Scanner;
class Factorial {
	private static int factorial(int num) {
		int factorial = 1;
		for(int i=num; i>0; i--) {
			factorial *= i;
		}
		return factorial;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		int factorial = factorial(num);
		System.out.print(num+"!: "+factorial);
	}
} 