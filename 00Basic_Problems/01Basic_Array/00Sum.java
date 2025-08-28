/*
	Problem Statement: Sum of Array Elements
	File Name: 00Sum.java
*/
class Sum {
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int ans = sum(arr);
		System.out.print("Sum of all array elements: "+ans);
	}
}
