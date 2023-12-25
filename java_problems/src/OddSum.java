import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        // instances
        Scanner sc = new Scanner(System.in);

        // variables
        int x, y, lower_number, i, odd_sum;

        // input
        System.out.println("Enter two integers:");
        System.out.print("-> ");
        x = sc.nextInt();
        System.out.print("-> ");
        y = sc.nextInt();
        System.out.println();
        sc.close();

        // logic
        if (x > y) {
            lower_number = y;
            y = x;
            x = lower_number;
        }

        odd_sum = 0;
        for (i = (x + 1); i < y; i++) {
            if (i % 2 != 0) {
                odd_sum += i;
            }
        }

        // results
        System.out.print("-> The sum of the odd numbers between " + x + " and " + 
        y + " is " + odd_sum + ".");
    }
}
