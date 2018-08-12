using System;

namespace Game_of_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int firstInt = int.Parse(Console.ReadLine());
            int secondInt = int.Parse(Console.ReadLine());
            int magicNumber = int.Parse(Console.ReadLine());

            int combinations = 0;
            for (int i = firstInt; i <= secondInt; i++)
            {
                for (int j = firstInt; j <= secondInt; j++)
                {
                    combinations++;
                    if (i + j == magicNumber && j >= i)
                    {
                        Console.WriteLine($"Number found! {j} + {i} = {i + j}");
                        return;
                    }
                }
            }
            Console.WriteLine($"{combinations} combinations - neither equals {magicNumber}");
        }
    }
}
