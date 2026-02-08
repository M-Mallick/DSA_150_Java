public class Main {
	public static void main(String[] args) {
	    // Count digits in a number
		int num = 0;
	    int count = 0;
	    if(num == 0) {
	        count = 1;
	    }else {
	        while(num != 0) {
	            num /= 10;
	            count++;
	        }
	    }
		System.out.println("Count : "+count);
	}
}
