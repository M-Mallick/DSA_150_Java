/*
	Problem Statement: Count of odd numbers in array
	File Name: 01CountOdd.java
*/

class CountOdd {
	public static int count(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 != 0) count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int ans = count(arr);
		System.out.print("Total Number of odd elements in the array is: "+ans);
	}

}
