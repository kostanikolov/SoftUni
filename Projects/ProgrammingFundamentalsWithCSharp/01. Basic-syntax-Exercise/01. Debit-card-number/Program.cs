using System;

namespace _01._Debit_card_number
{
    class Program
    {
        static void Main(string[] args)
        {
            int n1 = int.Parse(Console.ReadLine());
            int n2 = int.Parse(Console.ReadLine());
            int n3 = int.Parse(Console.ReadLine());
            int n4 = int.Parse(Console.ReadLine());

            Console.WriteLine($"{n1:d4} {n2:d4} {n3:d4} {n4:d4}");
            //Console.Write($"{n2:d4} ");
            //Console.Write($"{n3:d4} ");
            //Console.WriteLine($"{n4:d4}");
        }
    }
}
