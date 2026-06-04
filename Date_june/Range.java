package Date_june;

import java.util.Scanner;

public class Range {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        while (counter < n) {
            System.out.print(counter + "  ");
            counter++;
        }
    }
}
