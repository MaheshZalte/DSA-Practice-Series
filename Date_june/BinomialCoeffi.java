package Date_june;

import java.util.*;

public class BinomialCoeffi {

    public static long binomialCoefficient(int n, int r) {
        if (r > n || r < 0) {
            return 0;
        }

        return Date_june.Fectorial.factorial(n) / (Date_june.Fectorial.factorial(r) * Date_june.Fectorial.factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        long coeffi = binomialCoefficient(n, r);
        System.out.println("Binomial Coefficient C(" + n + ", " + r + ") is: " + coeffi);

    }

}
