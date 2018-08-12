using System;
using System.Linq;
using System.Collections.Generic;

namespace Max_sequence_of_equal_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            var numbers = Console.ReadLine()
                .Split()
                .Select(int.Parse)
                .ToList();

            int currentStart = 0;
            int currentLength = 1;
            int bestStart = 0;
            int bestLength = 1;

            for (int index = 1; index < numbers.Count; index++)
            {
                if (numbers[index] == numbers[index - 1])
                {
                    currentLength++;

                    if (currentLength > bestLength)
                    {
                        bestLength = currentLength;
                        bestStart = currentStart;
                    }
                }
                else
                {
                    currentLength = 1;
                    currentStart = index;
                }
            }

            for (int i = bestStart; i < bestStart + bestLength; i++)
            {
                Console.Write(numbers[i] + " ");
            }
        }
    }
}
