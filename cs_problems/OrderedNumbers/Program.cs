namespace OrderedNumbers;

class Program
{
    static void Main(string[] args)
    {
        // variables
        int x, y;

        // inputs
        do {
        Console.WriteLine("Enter two integers[equal values stop the program]:");
        Console.Write("X = ");
        x = int.Parse(Console.ReadLine());
        Console.Write("Y = ");
        y = int.Parse(Console.ReadLine());
        Console.WriteLine();

        // results
        if (x > y) {
            Console.WriteLine("Descending order!");
            Console.WriteLine();
        }
        else if (x < y) {
            Console.WriteLine("Ascending order!");
            Console.WriteLine();
        }
        else {
            Console.Write("Stopping the program...");
        }

        } while (x != y);
    }
}
