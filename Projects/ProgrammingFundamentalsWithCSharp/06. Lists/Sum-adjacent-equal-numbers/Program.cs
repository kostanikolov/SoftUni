using System;
using System.Linq;
using System.Collections.Generic;

namespace Sum_adjacent_equal_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            var numbers = Console.ReadLine().Split().Select(double.Parse).ToList();


            for (int i = 0; i < numbers.Count - 1; i++)
            {
                if (numbers[i] == numbers[i + 1])
                {
                    numbers[i] = numbers[i] + numbers[i + 1];
                    numbers.RemoveAt(i + 1);
                    i = -1;
                }
            }

            Console.WriteLine(string.Join(" ", numbers));

            //int i = 0;

            //while (i < numbers.Count - 1)
            //{
            //    if (numbers[i] == numbers[i + 1])
            //    {
            //        numbers[i] = numbers[i] + numbers[i + 1];
            //        numbers.RemoveAt(i + 1);
            //        i = 0;
            //    }
            //    else
            //    {
            //        i++;
            //    }
            //}

            //Console.WriteLine(string.Join(" ", numbers));
        }
    }
}
