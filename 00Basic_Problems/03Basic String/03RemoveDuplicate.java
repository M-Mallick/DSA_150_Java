// Remove Duplicate Characters in java
import java.util.HashSet;
class Main {
    public static void main(String[] args) {
        String ip = "Hello"; // It is immutabe
        
        // Method 1
        StringBuilder s = new StringBuilder();
        for(int i=0; i < ip.length(); i++) {
            char ch = ip.charAt(i);
            int a = ip.indexOf(ch, i+1); // It searches for the character starting from fromIndex(i+1) to the end of the string
            if(a == -1) {
                s.append(ch);
            }
        }
        System.out.println("Output: "+s.toString());
        
        // Method 2
        HashSet<Character> set = new HashSet<>(); // A HashSet does NOT allow duplicate values.
        StringBuilder s1 = new StringBuilder();
        for(int i=0; i < ip.length(); i++) {
            char ch = ip.charAt(i);
            if(!set.contains(ch)) {
                set.add(ch);
                s1.append(ch);
            }
        }
        System.out.print("Output1 : "+s1.toString());
        
    }
}
