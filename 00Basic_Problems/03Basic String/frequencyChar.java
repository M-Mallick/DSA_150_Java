import java.util.*;
public class Main {
    public static Map<Character, Integer> frequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            char key = str.charAt(i);
            // if(key != ' ')  map.put(key, map.getOrDefault(key, 0) + 1);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return map;
    }
	public static void main(String[] args) {
	    String str = "Mrid u Mallllll ic k";
	    Map<Character, Integer> freq = frequency(str);
	    for(Character key : freq.keySet()) {
	        System.out.println(key+" -> "+freq.get(key));
	    }
	}
}
