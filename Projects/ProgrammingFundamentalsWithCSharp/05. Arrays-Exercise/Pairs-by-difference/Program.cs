using System;
using System.Linq;

namespace Pairs_by_difference
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = Console.ReadLine().Split().Select(int.Parse).ToArray();
            int diff = int.Parse(Console.ReadLine());

            int counter = 0;

            for (int i = 0; i < numbers.Length; i++)
            {
                for (int j = i; j < numbers.Length; j++)
                {
                    bool difference = Math.Abs(numbers[i] - numbers[j]) == diff;

                    if (difference)
                    {
                        counter++;
                    }
                }
            }

            Console.WriteLine(counter);
        }
    }
}
