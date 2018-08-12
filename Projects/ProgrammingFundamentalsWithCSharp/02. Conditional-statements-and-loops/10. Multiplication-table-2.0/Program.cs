using System;

namespace _10._Multiplication_table_2._0
{
    class Program
    {
        static void Main(string[] args)
        {
            int n1 = int.Parse(Console.ReadLine());
            int n2 = int.Parse(Console.ReadLine());
            int product = 0;

            if (n2 > 10)
            {
                product = n1 * n2;
                Console.WriteLine($"{n1} X {n2} = {product}");
            }
            else
            {
                while (n2 <= 10)
                {
                    product = n1 * n2;
                    Console.WriteLine($"{n1} X {n2} = {product}");
                    n2++;
                }
            }
            
        }
    }
}
