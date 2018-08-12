using System;
using System.Collections.Generic;
using System.Linq;

namespace Bomb_number
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> numbers = Console.ReadLine().Split().Select(int.Parse).ToList();
            int[] detonator = Console.ReadLine().Split().Select(int.Parse).ToArray();

            int bomb = detonator[0];
            int range = detonator[1];

            for (int i = 0; i < numbers.Count; i++)
            {
                if (numbers[i] == bomb)
                {
                    if (range > i)
                    {
                        for (int j = i; j >= 0; j--)
                        {
                            numbers[j] = 0;
                        }
                    }
                    else
                    {
                        for (int j = i; j >= i - range; j--)
                        {
                            numbers[j] = 0;
                        }
                    }

                    if (numbers.Count - 1 > range + i)
                    {
                        for (int j = i; j <= range + i; j++)
                        {
                            numbers[j] = 0;
                        }
                    }
                    else
                    {
                        for (int j = i; j < numbers.Count; j++)
                        {
                            numbers[j] = 0;
                        }
                    }
                }
            }

            int result = 0;

            foreach (var num in numbers)
            {
                result += num;
            }

            Console.WriteLine(result);
        }
    }
}
