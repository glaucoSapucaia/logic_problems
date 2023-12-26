using System.Globalization;

// instances
CultureInfo CI = CultureInfo.InvariantCulture;

// vars
string name1, name2;
int age1, age2;
double age_average;

// input
Console.WriteLine("First person data:");
Console.Write("Name: ");
name1 = Console.ReadLine();
Console.Write("Age: ");
age1 = int.Parse(Console.ReadLine());
Console.WriteLine();
Console.WriteLine("Second person data:");
Console.Write("Name: ");
name2 = Console.ReadLine();
Console.Write("Age: ");
age2 = int.Parse(Console.ReadLine());
Console.WriteLine();

// logic
age_average = (double)(age1 + age2) / 2;

// results
Console.WriteLine("The average age between " + name1 + " and " + name2 + " is " + age_average.ToString("F1", CI) + ".");