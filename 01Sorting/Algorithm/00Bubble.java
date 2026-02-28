import java.util.*;
public class Main {
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if(flag == false) {
                break;
            }
        }
    }
	public static void main(String[] args) {
	    int[] arr = {7,2,1,5,0,-3};
	    bubbleSort(arr);
	    System.out.println(Arrays.toString(arr));
	}
}
