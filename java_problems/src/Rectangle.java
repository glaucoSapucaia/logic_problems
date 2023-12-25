import java.util.Locale;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        // settings
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // variables
        double base, height, area, perimeter, diagonal;

        // user input
        System.out.print("Base of the rectangle: ");
        base = sc.nextDouble();
        System.out.print("Height of the rectangle: ");
        height = sc.nextDouble();
        System.out.println();

        // calculations
        area = base * height;
        perimeter = 2 * (base + height);
        diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));

        // answers
        System.out.println("RESULTS");
        System.out.println("Area -> " + String.format("%.4f", area));
        System.out.println("Perimeter -> " + String.format("%.4f", perimeter));
        System.out.println("Diagonal -> " + String.format("%.4f", diagonal));

        sc.close();
    }
}
