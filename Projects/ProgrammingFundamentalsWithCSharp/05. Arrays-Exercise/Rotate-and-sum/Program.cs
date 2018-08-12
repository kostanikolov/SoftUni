using System;
using System.Linq;

namespace Rotate_and_sum
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();
            int rotations = int.Parse(Console.ReadLine());
            
            int[] result = new int[arr.Length];

            for (int rotation = 0; rotation < rotations; rotation++)
            {
                int lastElement = arr[arr.Length - 1];

                for (int index = arr.Length - 1; index > 0; index--)
                {
                    arr[index] = arr[index - 1];
                    result[index] += arr[index];
                }

                arr[0] = lastElement;
                result[0] += arr[0];
            }

            for (int i = 0; i < arr.Length; i++)
            {
                Console.Write(result[i] + " ");
            }
        }
    }
}
