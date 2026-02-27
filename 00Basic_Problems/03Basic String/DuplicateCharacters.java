import java.util.*;
public class Main {
    public static Map<Character, Integer> DuplicateCharacters(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            char key = str.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return map;
    }
	public static void main(String[] args) {
	    String str = "Programming";
	    Map<Character, Integer> map = DuplicateCharacters(str);
	    for(Character key : map.keySet()) {
	        if(map.get(key) > 1) {
	            System.out.println(key+" -> "+map.get(key));
	        }
	    }
	}
}
