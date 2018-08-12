using System;

namespace Master_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int num = int.Parse(Console.ReadLine());

            for (int i = 1; i <= num; i++)
            {
                if ((IsPalindrome(i)) && (SumOfDigits(i) % 7 == 0) && (ContainsEvenDigit(i)))
                {
                    Console.WriteLine(i);
                }
            }
        }

        static bool IsPalindrome(int num)
        {
            string currentNumber = num.ToString();

            int counter = 0;
            for (int i = currentNumber.Length - 1; i >= 0; i--)
            {
                if (currentNumber[i] != currentNumber[counter])
                {
                    return false;
                }
                counter++;
            }

            return true;
        }

        static int SumOfDigits(int num)
        {
            int sum = 0;

            while (num != 0)
            {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }

            return sum;
        }

        static bool ContainsEvenDigit(int num)
        {
            while (num != 0)
            {
                int digit = num % 10;
                if (digit % 2 == 0)
                {
                    return true;
                }

                num /= 10;
            }

            return false;
        }
    }
}
