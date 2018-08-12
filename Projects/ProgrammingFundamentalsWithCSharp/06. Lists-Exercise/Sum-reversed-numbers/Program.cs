using System;
using System.Collections.Generic;
using System.Linq;

namespace Sum_reversed_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> numbers = Console.ReadLine().Split().ToList();

            int result = 0;

            for (int i = 0; i < numbers.Count; i++)
            {
                string currentNumber = numbers[i];
                string reversed = string.Empty;

                for (int j = currentNumber.Length - 1; j >= 0; j--)
                {
                    reversed += currentNumber[j];
                }

                result += int.Parse(reversed);
            }

            Console.WriteLine(result);
        }
    }
}
