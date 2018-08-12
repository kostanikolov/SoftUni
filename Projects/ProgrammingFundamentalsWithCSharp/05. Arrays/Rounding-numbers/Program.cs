using System;
using System.Linq;

namespace Rounding_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            double[] nums = Console.ReadLine()
                .Split(' ')
                .Select(double.Parse)
                .ToArray();

            int[] roundedNums = new int[nums.Length];

            for (int index = 0; index < nums.Length; index++)
            {
                roundedNums[index] = (int) Math.Round(nums[index], MidpointRounding.AwayFromZero);
            }

            for (int index = 0; index < nums.Length; index++)
            {
                Console.WriteLine($"{nums[index]} -> {roundedNums[index]}");
            }
        }
    }
}
