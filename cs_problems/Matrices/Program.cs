using System.Globalization;
using System.Numerics;

// culture float
CultureInfo CI = CultureInfo.InvariantCulture;

// variables
int N, i, j, number_of_negatives;

// input
Console.Write("Matrix order: ");
N = int.Parse(Console.ReadLine());
Console.WriteLine();

// matrix and vector
double[,] matrix = new double[N, N];
double[] main_diagonal = new double[N];

// inputs
for (i = 0; i < N; i++) {
    for (j = 0; j < N; j++) {
        Console.Write("Matrix[" + (i + 1) + "," + (j + 1) + "] value -> ");
        matrix[i, j] = double.Parse(Console.ReadLine(), CI);
    }
}
Console.WriteLine();

// logic main_diagonal and number of negatives
number_of_negatives = 0;
for (i = 0; i < N; i++) {
    for (j = 0; j < N; j++) {
        if (matrix[i, j] < 0) {
            number_of_negatives += 1;
        }
        main_diagonal[i] = matrix[i, i];
    }
}

// results
Console.WriteLine("Matrix data:");
Console.Write("Main diagonal -> ");
for (i = 0; i < N; i++) {
    if (i == N - 1) {
        Console.Write(main_diagonal[i].ToString("F1", CI));
    }
    else {
        Console.Write(main_diagonal[i].ToString("F1", CI) + " | ");
    }
}
Console.WriteLine();
Console.Write("Number of negative values -> " + number_of_negatives);