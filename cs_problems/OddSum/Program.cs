namespace OddSum;

class Program
{
    static void Main(string[] args)
    {
        // variables
        int i, x, y, lower_number, odd_sum;

        // input
        Console.WriteLine("Enter two integers:");
        Console.Write("x = ");
        x = int.Parse(Console.ReadLine());
        Console.Write("y = ");
        y = int.Parse(Console.ReadLine());
        Console.WriteLine();

        // logic
        if (x > y) {
            lower_number = y;
            y = x;
            x = lower_number;
        }

        odd_sum = 0;
        for (i = x + 1; i < y; i++) {
            if (i % 2 != 0) {
                odd_sum += i;
            }
        }

        // result
        Console.Write("The odd sum between " + x + " and " + y + " is " + odd_sum + ".");
    }
}
