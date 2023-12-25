import java.util.Scanner;
import java.util.Locale;

public class Ages {
    public static void main(String[] args) {
        // instances
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        // variables
        String name1, name2;
        int age1, age2;
        double average;

        // input
        // first person
        System.out.println("First person data:");
        System.out.print("Name: ");
        name1 = sc.nextLine();
        System.out.print("Age: ");
        age1 = sc.nextInt();
        System.out.println();

        // second person
        System.out.println("Second person data:");
        System.out.print("Name: ");
        sc.nextLine();
        name2 = sc.nextLine();
        System.out.print("Age: ");
        age2 = sc.nextInt();
        System.out.println();

        // calculations
        average = (double)(age1 + age2) / 2;

        // answers
        System.out.print("-> The average age between " + name1 + " and " + name2 
        + " is " + String.format("%.2f", average) + ".");

        sc.close();
    }
}
