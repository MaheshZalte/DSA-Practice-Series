package Date_june;

import java.util.Scanner;

public class PrintPrimes {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + "  ");
            }
        }
    }

    public static int Decimal(int n) {
        int decimal = 0;
        int power = 0;
        while (n > 0) {
            int LastDigit = n % 10;
            decimal = decimal + LastDigit * (int) Math.pow(2, power);
            power++;
            n /= 10;
        }

        return decimal;
    }

    public static int Binary(int n) {
        int binary = 0;
        int power = 0;
        while (n > 0) {
            int modulo = n % 2;
            binary = binary + modulo * (int) Math.pow(10, power);
            n /= 2;
            power++;
        }

        return binary;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // printPrimes(n);

        // System.out.println();
        // System.out.println("Decimal equivalent of the binary number " + n + " is: " + Decimal(n));
        System.out.println("Binary equivalent of the decimal number " + n + " is: " + Binary(n));
    }
}
