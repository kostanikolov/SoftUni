using System;
using System.Linq;

namespace Triple_sum
{
    class Program
    {
        static void Main(string[] args)
        {
            long[] arr = Console.ReadLine()
                .Split(' ')
                .Select(long.Parse)
                .ToArray();

            bool flag = true;

            for (long a = 0; a < arr.Length; a++)
            {
                for (long b = a + 1; b < arr.Length; b++)
                {
                    for (long c = 0; c < arr.Length; c++)
                    {
                        if (arr[a] + arr[b] == arr[c])
                        {
                            flag = false;
                            Console.WriteLine($"{arr[a]} + {arr[b]} == {arr[c]}");
                            break;
                        }
                    }
                }
            }

            if (flag)
            {
                Console.WriteLine($"No");
            }
        }
    }
}
