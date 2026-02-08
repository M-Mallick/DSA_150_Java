// Remove white spaces from string in java
import java.util.*;
class Main {
    public static void main(String[] args) {
        String ip = "Hello World"; // It is immutabe
        
        // Method 1
        StringBuilder s = new StringBuilder();
        for(int i=0; i<ip.length(); i++) {
            if(ip.charAt(i) != ' ') {
                s.append(ip.charAt(i));
            }
        }
        System.out.println(s.toString());
        
        // Method 2
        String result = ip.replace(" ", "");
        System.out.println(result);
    }
}
