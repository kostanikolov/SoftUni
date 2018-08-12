using System;
using System.Linq;

namespace Equal_sums
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = Console.ReadLine().Split().Select(int.Parse).ToArray();

            if (numbers.Length == 1)
            {
                Console.WriteLine(0);
                return;
            }

            for (int i = 0; i < numbers.Length; i++)
            {
                int leftSum = 0;
                int rightSum = 0;

                for (int toRight = i; toRight < numbers.Length - 1; toRight++)
                {
                    rightSum += numbers[toRight + 1];
                }

                for (int toLeft = i - 1; toLeft >= 0; toLeft--)
                {
                    leftSum += numbers[toLeft];
                }

                if (leftSum == rightSum)
                {
                    Console.WriteLine(i);
                    return;
                }
            }

            Console.WriteLine("no");
        }
    }
}
