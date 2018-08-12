using System;
using System.Linq;


namespace Reverse_array_of_integers
{
    class Program
    {
        static void Main(string[] args)
        {
            int arrLenght = int.Parse(Console.ReadLine());
            int[] arr = new int[arrLenght];

            for (int index = 0; index < arr.Length; index++)
            {
                arr[index] = int.Parse(Console.ReadLine());
            }

            for (int index = arr.Length - 1; index >= 0; index--)
            {
                Console.Write($"{arr[index]} ");
            }

            Console.WriteLine();
        }
    }
}
