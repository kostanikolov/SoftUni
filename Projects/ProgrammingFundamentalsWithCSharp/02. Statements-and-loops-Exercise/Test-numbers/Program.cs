using System;

namespace Test_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            //            •	First line – N – integer in the interval[1…100]
            //•	Second line – M – integer in the interval[1…100]
            //•	Third line – maximum sum boundary – integer in the interval[1…1000000]

            int firstInt = int.Parse(Console.ReadLine());
            int secondInt = int.Parse(Console.ReadLine());
            int boundry = int.Parse(Console.ReadLine());

            int sum = 0;
            int combinations = 0;

            for (int i = firstInt; i >= 1; i--)
            {
                for (int j = 1; j <= secondInt; j++)
                {
                    combinations++;
                    int product = (i * j) * 3;
                    sum += product;

                    if (sum >= boundry)
                    {
                        Console.WriteLine($"{combinations} combinations");
                        Console.WriteLine($"Sum: {sum} >= {boundry}");
                        return;
                    }
                }
            }

            Console.WriteLine($"{combinations} combinations");
            Console.WriteLine($"Sum: {sum}");
        }
    }
}
