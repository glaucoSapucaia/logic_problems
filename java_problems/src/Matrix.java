import java.util.Scanner;

public class Matrix {
    // static vars
    static Scanner sc;
    public static void main(String[] args) {
        // instances
        sc = new Scanner(System.in);

        // variables
        int matrix_order, i, j, number_negatives;
        double matrix[][], vector[];

        // input
        System.out.print("Matrix order: ");
        matrix_order = sc.nextInt();
        System.out.println();

        matrix = new double[matrix_order][matrix_order];
        for (i = 0; i < matrix_order; i++) {
            for (j = 0; j < matrix_order; j++) {
                System.out.print("Matrix[" + (i + 1) + "," + (j + 1) + "] value: ");
                matrix[i][j] = sc.nextDouble();
            }
        }
        System.out.println();

        // number of negatives and main diagonal logic
        vector = new double[matrix_order];
        number_negatives = 0;
        for (i = 0; i < matrix_order; i++) {
            for (j = 0; j < matrix_order; j++) {
                if (i == j) {
                    vector[i] = matrix[i][j];
                }
                if (matrix[i][j] < 0) {
                    number_negatives += 1;
                }
            }
        }

        // results
        System.out.println("Matrix data:");
        System.out.print("Main diagonal -> ");
        for (i = 0; i < matrix_order; i++) {
            if (i == (matrix_order -1)) {
                System.out.println(vector[i]);
            }
            else {
                System.out.print(vector[i] + " | ");
            }
        }
        System.out.print("Number of negative values -> " + number_negatives);

        sc.close();
    }
}
