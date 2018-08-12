using System;

namespace _08._Sum_of_odd_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int sum = 0;
            int counter = 0;

            for (int i = 1; i <= int.MaxValue; i++)
            {
                
                if (i % 2 != 0)
                {
                    counter++;
                    Console.WriteLine(i);
                    sum += i;

                    if (counter == n)
                    {
                        break;
                    }
                }
            }

            Console.WriteLine($"Sum: {sum}");
        }
    }
}
