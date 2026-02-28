import java.util.*;
public class Main {
    public static void commanChars(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str1.length(); i++) {
            char key = str1.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for(int i=0; i<str2.length(); i++) {
            char key = str2.charAt(i);
            if(map.containsKey(key) && map.get(key) > 0) {
                System.out.print(key+" ");
                map.put(key, map.get(key) - 1);
            }
        }
    }
	public static void main(String[] args) {
	    String str1 = "Projgrammingaj";
	    String str2 = "javam";
	    commanChars(str1, str2);
	}
}
