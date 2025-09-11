/*
	Problem Statement: Reverse a String
	File Name: 00Reverse.java
*/
class Reverse {
    public static String reverseString(String s) {
        // code here
        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length - 1;
        
        while(left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        return new String(str);
    }
    public static void main(String[] args) {
    	String s = "abcdef";
    	String rev = reverseString(s);
    	System.out.print(rev);
    }
}
