/*
	Problem Statement: GCD of Two Numbers
	File Name: 10GCD.java
*/
import java.util.Scanner;
class GCD {
	private static int gcd(int num1, int num2) {
		int gcd = 0;
		for(int i=1; i<=num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				if(gcd < i) {
					gcd = i;
				}
			} 
		}
		return gcd;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int ans = gcd(num1,num2);
		System.out.println("GCD("+num1+","+num2+"): "+ans);
	}

} 
