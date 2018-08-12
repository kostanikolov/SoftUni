using System;
using System.Linq;
using System.Collections.Generic;

namespace Remove_negatives_and_reverse
{
    class Program
    {
        static void Main(string[] args)
        {
            var numbers = Console.ReadLine().Split().Select(int.Parse).ToList();
            var result = new List<int>();

            foreach (var num in numbers)
            {
                if (num >= 0)
                {
                    result.Add(num);
                }
            }

            if (result.Count == 0)
            {
                Console.WriteLine("empty");
            }
            else
            {
                result.Reverse();
                Console.WriteLine(string.Join(" ", result));
            }
        }
    }
}
