using System;
using System.Linq;
using System.Collections.Generic;

namespace Sort_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            var numbers = Console.ReadLine().Split().Select(double.Parse).ToList();

            numbers.Sort();

            Console.WriteLine(string.Join(" <= ", numbers));
        }
    }
}
