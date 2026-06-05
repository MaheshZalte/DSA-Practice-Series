package Date_june;

import java.util.Scanner;

public class SumOfN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // int counter = 1;
        // while (counter <= n) {
        //     sum += counter;
        //     counter++;
        // }
        // System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        // for loop
        // for (int i = 1; i < 5; i++) {
        //     for (int j = 1; j < 5; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // reverse number 
        int n = sc.nextInt();
        int reverse = 0;
        while (n > 0) {

            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;

        }
        System.out.println("Reverse of the number is: " + reverse);

    }

}
