using System;
using System.Linq;
using System.Collections.Generic;

namespace Square_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = Console.ReadLine().Split().Select(int.Parse).ToArray();

            var squares = new List<int>();

            foreach (var num in numbers)
            {
                if (Math.Sqrt(num) == (int)Math.Sqrt(num))
                {
                    squares.Add(num);
                }
            }

            squares.Sort();
            squares.Reverse();

            Console.WriteLine(string.Join(" ", squares));
        }
    }
}
