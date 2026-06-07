package Date_june;

import java.util.*;

public class Fectorial {

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return -1;
        }
        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = factorial(n);
        if (fact == -1) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            System.out.println("Factorial of " + n + " is: " + fact);
        }

    }
}
