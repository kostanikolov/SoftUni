using System;
using System.Linq;

namespace Reverse_array_of_strings
{
    class Program
    {
        static void Main(string[] args)
        {
            //string[] arr = Console.ReadLine()
            //    .Split(' ')
            //    .ToArray();

            //for (int index = arr.Length - 1; index >= 0; index--)
            //{
            //    Console.Write($"{arr[index]} ");
            //}
            //Console.WriteLine();

            var nums = Console.ReadLine().Split(' ').ToArray();

            for (int i = 0; i < nums.Length / 2; i++)
            {
                SwapElements(nums, i, nums.Length - 1 - i);
            }

            Console.WriteLine(string.Join(" ", nums));
        }

        static void SwapElements(string[] arr, int i, int j)
        {
            var oldElement = arr[i];
            arr[i] = arr[j];
            arr[j] = oldElement;
        }

    }
}
