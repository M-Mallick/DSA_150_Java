import java.util.*;
public class Main {
    public static String longestWord(String str) {
        String ans = "";
        int i = 0, j = 0;
        while(i < str.length()) {
            if(str.charAt(i) == ' ') {
                if(ans.length() < str.substring(j, i).length()) {
                    ans = str.substring(j, i);
                }
                j = i + 1;
            }
            i++;
        }
        return ans;
    }
	public static void main(String[] args) {
	    String str = "Mrid u Mallllll ic k";
	    String ans = longestWord(str);
		System.out.println(ans);
	}
}
