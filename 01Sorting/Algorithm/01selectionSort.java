import java.util.*;
public class Main {
    public static void selectionSort(int[] arr) {
        int min;
        for(int i = 0; i < arr.length - 1; i++) {
            min = i;
            // find the mimimum w.r.t arr[i] of nu-sorted array(i + 1 to n);
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            // swapped b/w i and min
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
	public static void main(String[] args) {
	    int[] arr = {7,2,1,5,0,-3};
	    selectionSort(arr);
	    System.out.println(Arrays.toString(arr));
	}
}
