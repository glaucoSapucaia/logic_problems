import java.util.Scanner;

public class UnderThree {
    public static void main(String[] args) {
        // instances
        Scanner sc = new Scanner(System.in);

        // vars
        int a, b, c, lower_value;

        // input
        System.out.println("Integer values:");
        System.out.print("First value: ");
        a = sc.nextInt();
        System.out.print("Second value: ");
        b = sc.nextInt();
        System.out.print("Third value: ");
        c = sc.nextInt();
        System.out.println();

        // logic
        if (a < b && a < c) {
            lower_value = a;
        }
        else if (b < c) {
            lower_value = b;
        }
        else {
            lower_value = c;
        }

        // results
        System.out.print("Lower value -> " + lower_value + ".");

        sc.close();
    }
}
