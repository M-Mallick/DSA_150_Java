public class Main
{
    private static boolean isPrime(int i) {
        if(i < 1) return false;
        for(int j = 2; j * j <= i; j++) { // j <= i/2  &  0 is not a prime nor composite
            if(i % j == 0) {              //              1 is not prime by definition ( p > 1)
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
	    // Print Prime numbers from 23 to 35
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter start: ");
	    int start = sc.nextInt();
	    System.out.print("\nEnter end: ");
	    int end = sc.nextInt();
	    
	    for(int i = start; i <= end; i++) {
	        if(isPrime(i)) {
	            System.out.print(" "+i);
	        }
	    }
	}
}
