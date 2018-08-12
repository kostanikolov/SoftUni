using System;
using System.Linq;

namespace TestProject
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[] { 10, 20, 30 };

            int[] arr2 = arr.Reverse().ToArray();

            for (int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine(arr[i]);
            }
            Console.WriteLine(  "-----------------------");
            for (int i = 0; i < arr2.Length; i++)
            {
                Console.WriteLine(arr2[i]);
            }
        }
    }
}
