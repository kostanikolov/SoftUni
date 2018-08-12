using System;
using System.Collections.Generic;
using System.Linq;

namespace Count_real_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            double[] nums = Console.ReadLine().Split().Select(double.Parse).ToArray(); // [8] [2.5] [2.5] [8] [2.5]
            var counts = new SortedDictionary<double, int>(); // Empty

            foreach (var num in nums)
            {
                if (counts.ContainsKey(num))
                {
                    counts[num]++; // Key = 8; Value = ++
                }
                else
                {
                    counts[num] = 1;
                }
            }

            foreach (var num in counts)
            {
                Console.WriteLine("{0} -> {1}", num.Key, num.Value);
            }
        }
    }
}
