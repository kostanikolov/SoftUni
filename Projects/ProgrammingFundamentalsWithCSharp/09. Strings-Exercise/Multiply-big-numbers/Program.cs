using System;
using System.Linq;
using System.Text;

namespace Multiply_big_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            string number = Console.ReadLine().Trim('0');
            int multiplier = int.Parse(Console.ReadLine());

            if (multiplier == 0)
            {
                Console.WriteLine(0);
                return;
            }

            int remainder = 0;
            StringBuilder sb = new StringBuilder();

            for (int i = number.Length - 1; i >= 0; i--)
            {
                int currDigit = int.Parse(number[i].ToString());
                int currResult = currDigit * multiplier + remainder;

                sb.Append(currResult % 10);
                remainder = currResult / 10;
            }

            if (remainder != 0)
            {
                Console.Write($"{remainder}");
            }

            Console.WriteLine(string.Concat(sb.ToString().Reverse()));
        }
    }
}
