/*
	Problem Statement: Check if the Number is Armstrong
	File Name: 06Armstrong.java
*/
import java.util.Scanner;
class Armstrong {
	private static int count(int num) {
		int count = 0;
		while(num != 0) {
			num /= 10;
			count++;
		}
		return count;
	}
	private static boolean armstrong(int num) {
		int number = num;
		int count = count(num);
		int ans = 0;
		while(num != 0) {
			int rem = num % 10;
			ans += (int) Math.pow(rem,count);
			num /= 10;
		}
		return number == ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		boolean armstrong = armstrong(num);
		System.out.println(num+" is a Armstrong: "+armstrong);
	}

}
