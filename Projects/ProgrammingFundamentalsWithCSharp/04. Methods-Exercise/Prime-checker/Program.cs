using System;

namespace Prime_checker
{
    class Program
    {
        static void Main(string[] args)
        {
            long num = long.Parse(Console.ReadLine());

            bool primeOrNot = IsPrime(num);
            Console.WriteLine(primeOrNot);
        }

        static bool IsPrime(long num)
        {
            if (num < 2)
            {
                return false;
            }

            for (int i = 2; i <= Math.Sqrt(num); i++)
            {
                if (num % i == 0)
                {
                    return false;
                }
            }

            return true;
        }
    }
}
