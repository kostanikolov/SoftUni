using System;

namespace Print_ascii
{
    class Program
    {
        static void Main(string[] args)
        {
            int first = int.Parse(Console.ReadLine());
            int second = int.Parse(Console.ReadLine());

            for (char symbol = (char)first; symbol <= second; symbol++)
            {
                Console.Write($"{symbol} ");
            }
            Console.WriteLine();
        }
    }
}
