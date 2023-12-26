using System.Globalization;

// instances
CultureInfo CI = CultureInfo.InvariantCulture;

// vars
double _base, height, area, perimeter, diagonal;

// inputs
Console.Write("Base of the rectangle: ");
_base = double.Parse(Console.ReadLine(), CI);
Console.Write("Height of the rectangle: ");
height = double.Parse(Console.ReadLine(), CI);
Console.WriteLine();

// calculations
area = _base * height;
perimeter = 2 * (_base + height);
diagonal = Math.Sqrt(Math.Pow(_base, 2) + Math.Pow(height, 2));

// answers
Console.WriteLine("Rectangle data:");
Console.WriteLine("Area -> " + area.ToString("F4", CI));
Console.WriteLine("Perimeter -> " + perimeter.ToString("F4", CI));
Console.WriteLine("Diagonal -> " + diagonal.ToString("F4", CI));