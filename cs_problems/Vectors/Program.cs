using System.Globalization;

// culture
CultureInfo CI = CultureInfo.InvariantCulture;

// vars
int number_of_vector_values, i;
double vector_sum, vector_average_numbers;

// inputs
Console.Write("Number of vector values: ");
number_of_vector_values = int.Parse(Console.ReadLine());
Console.WriteLine();

// vector
double[] vector = new double[number_of_vector_values];

for (i = 0; i < number_of_vector_values; i++) {
    Console.Write("Vector[" + (i + 1) + "] value: ");
    vector[i] = double.Parse(Console.ReadLine(), CI);
}
Console.WriteLine();

// logic
vector_sum = 0;
for (i = 0; i < number_of_vector_values; i++) {
    vector_sum += vector[i];
}

vector_average_numbers = vector_sum / number_of_vector_values;

// answers
Console.WriteLine("Vector data:");
Console.Write("Vector values -> ");
for (i = 0; i < number_of_vector_values; i++) {
    if (i == number_of_vector_values - 1) {
        Console.Write(vector[i].ToString("F1", CI));
    }
    else {
        Console.Write(vector[i].ToString("F1", CI) + " | ");
    }
}
Console.WriteLine();
Console.WriteLine("Vector sum -> " + vector_sum.ToString("F2", CI));
Console.WriteLine("Average of vector values -> " + vector_average_numbers.ToString("F2", CI));