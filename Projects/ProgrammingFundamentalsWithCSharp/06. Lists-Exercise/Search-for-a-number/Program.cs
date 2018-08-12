using System;
using System.Collections.Generic;
using System.Linq;

namespace Search_for_a_number
{
    class Program
    {
        static void Main(string[] args)
        {
            var numbers = Console.ReadLine().Split().Select(int.Parse).ToList();
            int[] controlNums = Console.ReadLine().Split().Select(int.Parse).ToArray();

            var result = new List<int>();

            int numbersTaken = controlNums[0];
            int numbersDeleted = controlNums[1];
            
            for (int i = 0; i < numbersTaken; i++)
            {
                result.Add(numbers[i]);
            }

            for (int i = 0; i < numbersDeleted; i++)
            {
                result.RemoveAt(0);
            }

            bool isThere = result.Contains(controlNums[2]);

            if (isThere)
            {
                Console.WriteLine("YES!");
            }
            else
            {
                Console.WriteLine("NO!");
            }
        }
    }
}
