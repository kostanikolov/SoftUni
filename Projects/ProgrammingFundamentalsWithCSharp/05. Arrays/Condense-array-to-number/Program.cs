using System;
using System.Linq;

namespace Condense_array_to_number
{
    class Program
    {
        static void Main(string[] args)
        {
            //int[] nums = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            //int[] condensed = new int[nums.Length - 1];

            int[] mainMasiv = Console.ReadLine().Split().Select(int.Parse).ToArray();
            int[] condensedMasiv = new int[mainMasiv.Length - 1];

            if (mainMasiv.Length == 1)
            {
                Console.WriteLine(mainMasiv[0]);
                return;
            }

            for (int i = 0; i < mainMasiv.Length; i++)
            {
                for (int j = 0; j < condensedMasiv.Length - i; j++)
                {
                    condensedMasiv[j] = mainMasiv[j] + mainMasiv[j + 1];
                }
                mainMasiv = condensedMasiv;
            }
            Console.WriteLine(condensedMasiv[0]);
        }
    }
}
