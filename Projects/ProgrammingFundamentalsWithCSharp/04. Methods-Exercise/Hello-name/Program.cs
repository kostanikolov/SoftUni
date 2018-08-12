using System;

namespace Hello_name
{
    class Program
    {
        static void Main(string[] args)
        {
            string name = Console.ReadLine();
            PrintHello(name);
        }

        static void PrintHello(string name)
        {
            Console.WriteLine($"Hello, {name}!");
        }
    }
}
