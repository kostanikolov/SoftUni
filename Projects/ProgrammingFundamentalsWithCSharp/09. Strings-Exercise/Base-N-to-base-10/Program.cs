using System;
using System.Numerics;

namespace Base_N_to_base_10
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Trim().Split();

            int @base = int.Parse(input[0]);
            char[] numToConvert = input[1].ToCharArray();

            BigInteger result = new BigInteger(0);

            for (int i = 0; i < numToConvert.Length; i++)
            {
                int currentNum = (int)Char.GetNumericValue(numToConvert[i]);
                result += currentNum * BigInteger.Pow(@base, numToConvert.Length - i - 1);
            }

            Console.WriteLine(result);
        }
    }
}
