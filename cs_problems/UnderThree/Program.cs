// variables
int a, b, c, lower_number;

// inputs
Console.WriteLine("Enter three integers:");
Console.Write("A = ");
a = int.Parse(Console.ReadLine());
Console.Write("B = ");
b = int.Parse(Console.ReadLine());
Console.Write("C = ");
c = int.Parse(Console.ReadLine());
Console.WriteLine();

// logic
if (a < b && a < c) {
    lower_number = a;
}
else if (b < c) {
    lower_number = b;
}
else {
    lower_number = c;
}

// answer
Console.WriteLine("Lower number -> " + lower_number);