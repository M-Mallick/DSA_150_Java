/*
	Problem Statement: Check if the Array is Sorted I
	File Name: 02CheckSort
*/
class CheckSort {
	public static boolean checkSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < arr[i-1]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		boolean ans = checkSort(arr);
		System.out.print("ans");
	}
}