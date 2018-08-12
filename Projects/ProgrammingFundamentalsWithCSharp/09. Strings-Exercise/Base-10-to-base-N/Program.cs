using System;
using System.Linq;
using System.Numerics;
using System.Text;

namespace Base_10_to_base_N
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split();

            int baseSystem = int.Parse(input[0]);
            BigInteger numToConvert = BigInteger.Parse(input[1]);

            StringBuilder remainders = new StringBuilder();

            while (numToConvert > 0)
            {
                remainders.Append(numToConvert % baseSystem);
                numToConvert /= baseSystem;
            }

            Console.WriteLine(string.Concat(remainders.ToString().Reverse()));
        }
    }
}
