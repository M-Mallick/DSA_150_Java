/*
	Problem Statement: Find Closest Person (LeedCode: 3516)
	File Name: 12ClosestPerson.java
*/
import java.util.Scanner;
class ClosestPerson {
    public static int findClosest(int x, int y, int z) {
        int person1 = (int) Math.abs(z - x);
        int person2 = (int) Math.abs(z - y);
        if(person1 > person2) return 2;
        else if(person1 < person2) return 1;
        else return 0;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Position of person1 (x): ");
		int x = sc.nextInt();		
		System.out.print("Enter Position of person2 (y): ");
		int y = sc.nextInt();		
		System.out.print("Enter Position of person3 (z): ");
		int z = sc.nextInt();
		int closest_Person = findClosest(x,y,z);
		System.out.print("The person"+closest_Person+" is closest of person3");
	}
} 