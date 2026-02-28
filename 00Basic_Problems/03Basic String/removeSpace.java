import java.util.*;
public class Main {
    public static String removeRemove(String str) {
        StringBuilder s = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != ' ') {
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }
	public static void main(String[] args) {
	    String str = "Mrid u Mall ic k";
	   // str = str.replaceAll(" ", "");  // -> Internally replaceAll compiles 
	                                      //    the given string into a regular 
	                                      //    expression pattern using the Pattern class.
	   String ans = removeRemove(str);
		System.out.println(ans);
	}
}
