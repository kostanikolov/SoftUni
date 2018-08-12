using System;

namespace Interval_of_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int n1 = int.Parse(Console.ReadLine());
            int n2 = int.Parse(Console.ReadLine());

            if (n1 > n2)
            {
                for (int i = n1; i >= n2; i--)
                {
                    Console.WriteLine(i);
                }
            }
            else
            {
                for (int i = n1; i <= n2; i++)
                {
                    Console.WriteLine(i);
                }
            }
        }
    }
}
