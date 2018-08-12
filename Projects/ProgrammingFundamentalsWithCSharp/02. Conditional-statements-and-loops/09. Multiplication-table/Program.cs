using System;

namespace _09._Multiplication_table
{
    class Program
    {
        static void Main(string[] args)
        {
            int n1 = int.Parse(Console.ReadLine());
            int n2 = 1;
            int product = 0;

            for (int i = 1; i <= 10; i++)
            {
                product = n1 * n2;
                Console.WriteLine($"{n1} X {n2} = {product}");
                n2++;
            }
        }
    }
}
