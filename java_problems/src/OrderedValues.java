import java.util.Scanner;

public class OrderedValues {
    public static void main(String[] args) {
        // instances
        Scanner sc = new Scanner(System.in);

        // variables
        int x, y;

        // loop
        do {
            // input
            System.out.println("Two integers [Enter equal integers to stop]:");
            System.out.print("X: ");
            x = sc.nextInt();
            System.out.print("Y: ");
            y = sc.nextInt();
            System.out.println();

            // logic
            if (x < y) {
                System.out.println("-> Ascending order!");
            }
            else if (y < x) {
                System.out.println("-> Descending order!");
            }
            else {
                System.out.print("Equal numbers | Ending the program...");
            }
            System.out.println();
        } while (x != y);

        sc.close();
    }
}
