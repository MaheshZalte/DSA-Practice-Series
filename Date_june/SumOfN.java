package Date_june;

import java.util.Scanner;

public class SumOfN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int counter = 1;
        while (counter <= n) {
            sum += counter;
            counter++;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }

}
