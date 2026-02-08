// Find occurrance of each character in string in java
import java.util.*;
class Main {
    public static void main(String[] args) {
        String ip = "Hello World"; // It is immutabe
        
        // Method 1
        // HashMap does NOT maintain insertion order.
        // LinkedHashMap: To maintain insertion oredr
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<ip.length(); i++) {
            char key = ip.charAt(i);
            if(!map.containsKey(key)) {
                map.put(key, 1);
            }else {
                map.put(key, map.get(key) + 1);
            }
        }
        
        for(Character key : map.keySet()) {
            System.out.println(key+" : "+map.get(key));
        }
    }
}
