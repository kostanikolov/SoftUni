using System;
using System.Linq;

namespace Extract_middle_element
{
    class Program
    {
        static void Main(string[] args)
        {
            long[] nums = Console.ReadLine().Split(' ').Select(long.Parse).ToArray();

            if (nums.Length == 1)
            {
                PrintOneElement(nums);
                return;
            }
            else if (nums.Length % 2 == 0)
            {
                PrintEvenElements(nums);
            }
            else if (nums.Length % 2 != 0)
            {
                PrintOddElements(nums);
            }

            Console.WriteLine();
        }

        static void PrintOneElement(long[] nums)
        {
            Console.WriteLine("{ " + $"{nums[0]}" + " }");
        }

        static void PrintEvenElements(long[] nums)
        {
            long first = nums.Length / 2 - 1;
            long second = nums.Length / 2;

            for (int i = 0; i < 1; i++)
            {
                Console.Write("{ " + $"{nums[first]}, " + $"{nums[second]}" + " } ");
            }
        }

        static void PrintOddElements(long[] nums)
        {
            long first = nums.Length / 2 - 1;
            long second = nums.Length / 2;
            long third = nums.Length / 2 + 1;

            for (int i = 0; i < 1; i++)
            {
                Console.Write("{ " + $"{nums[first]}, " + $"{nums[second]}, " + $"{nums[third]}" + " }");
            }
        }
    }
}
