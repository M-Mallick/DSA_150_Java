import java.util.*;

public class Main {

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    private static boolean krishnamurthy(int num) {   // 145 = 1! + 4! + 5!
        if (num < 1) return false;

        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num + " is a krishnamurthy: " + krishnamurthy(num));
        sc.close();
    }
}
