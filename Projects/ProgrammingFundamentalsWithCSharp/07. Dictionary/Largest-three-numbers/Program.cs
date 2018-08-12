using System;
using System.Collections.Generic;
using System.Linq;

namespace Largest_three_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            var numbers = Console.ReadLine().Split().Select(double.Parse).OrderByDescending(num => num).ToList();
            var largestThreeNums = numbers.Take(3);
            Console.WriteLine(string.Join(" ", largestThreeNums));
        }
    }
}
