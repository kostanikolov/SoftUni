using System;

namespace English_name_of_the_last_digit
{
    class Program
    {
        static void Main(string[] args)
        {
            long num = long.Parse(Console.ReadLine());

            Console.WriteLine(GetNameOfDigit(num));
        }
        
        static string GetNameOfDigit(long num)
        {
            long lastDigit = Math.Abs(num % 10);
            string nameOfDigit = string.Empty;

            switch (lastDigit)
            {
                case 0:
                    nameOfDigit = "zero";
                    break;
                case 1:
                    nameOfDigit = "one";
                    break;
                case 2:
                    nameOfDigit = "two";
                    break;
                case 3:
                    nameOfDigit = "three";
                    break;
                case 4:
                    nameOfDigit = "four";
                    break;
                case 5:
                    nameOfDigit = "five";
                    break;
                case 6:
                    nameOfDigit = "six";
                    break;
                case 7:
                    nameOfDigit = "seven";
                    break;
                case 8:
                    nameOfDigit = "eight";
                    break;
                case 9:
                    nameOfDigit = "nine";
                    break;
            }

            return nameOfDigit;
        }
    }
}
