using System;
using System.Linq;
using System.Collections.Generic;

namespace Count_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            var numbers = Console.ReadLine().Split().Select(int.Parse).ToList();

            int[] counts = new int[numbers.Max() + 1];

            foreach (var num in numbers)
            {
                counts[num]++;
            }

            for (int i = 0; i < counts.Length; i++)
            {
                if (counts[i] > 0)
                {
                    Console.WriteLine($"{i} -> {counts[i]}");
                }
            }
        }
    }
}
