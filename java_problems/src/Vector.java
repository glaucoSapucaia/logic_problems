import java.util.Locale;
import java.util.Scanner;

public class Vector {
    // static vars
    static Scanner sc;
    public static void main(String[] args) {
        // Configs
        Locale.setDefault(Locale.US);
        sc = new Scanner(System.in);

        // vars
        int number_vector_values, i;
        double vector[], sum_vector_values, average_values_vector;

        // inputs
        System.out.print("Number of vector values: ");
        number_vector_values = sc.nextInt();
        System.out.println();

        vector = new double[number_vector_values];
        for (i = 0; i < number_vector_values; i++) {
            System.out.print("Vector[" + (i + 1) + "] value: ");
            vector[i] = sc.nextDouble();
        }
        System.out.println();

        // logic
        sum_vector_values = 0;
        for (i = 0; i < number_vector_values; i++) {
            sum_vector_values += vector[i];
        }

        average_values_vector = sum_vector_values / number_vector_values;

        // answers
        System.out.println("Vector data:");
        System.out.print("Values -> ");
        for (i = 0; i < number_vector_values; i++) {
            if (i == (number_vector_values - 1)) {
                System.out.println(vector[i]);
            }
            else {
            System.out.print(vector[i] + " | ");
            }
        }

        System.out.println("Sum of vector values -> " + String.format("%.2f", sum_vector_values));
        System.out.println("Average of vector values -> " + String.format("%.2f", average_values_vector));

        sc.close();
    }
}
