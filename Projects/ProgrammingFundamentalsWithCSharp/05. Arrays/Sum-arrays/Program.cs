using System;
using System.Linq;

namespace Sum_arrays
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr1 = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int[] arr2 = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();

            if (arr1.Length <= arr2.Length)
            {
                int sum = 0;

                for (int i = 0; i < arr2.Length; i++)
                {
                    sum = arr1[i % arr1.Length] + arr2[i % arr2.Length];
                    Console.Write(sum + " ");
                }
            }
            else
            {
                int sum = 0;

                for (int i = 0; i < arr1.Length; i++)
                {
                    sum = arr1[i % arr1.Length] + arr2[i % arr2.Length];
                    Console.Write(sum + " ");
                }
            }
            Console.WriteLine();
        }
    }
}
