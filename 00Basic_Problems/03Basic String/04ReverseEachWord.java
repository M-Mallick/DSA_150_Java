// Reverse Each word of a string in java  [ T.C = O(n) & S.C = O(n)]
import java.util.*;
class Main {
    private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        String ip = "Hello World"; // It is immutabe
        
        // Method 1
        String[] arr = ip.split(" ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = reverse(arr[i]);
        }
        System.out.print(Arrays.toString(arr));
        
        StringBuilder s = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            if(i == arr.length - 1) {
                s.append(arr[i]);
            }else {
                s.append(arr[i]);
                s.append(" ");
            }
        }
        System.out.print("\nOutput1: "+s.toString());
        
        String s1 = String.join(" ", arr);
        System.out.print("\nOutput2: "+s1);
    }
}
