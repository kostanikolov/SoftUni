using System;

namespace _12._Number_checker
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                try
                {
                    int num = int.Parse(Console.ReadLine());
                    Console.WriteLine("It is a number.");
                    return;
                }
                catch (Exception)
                {
                    Console.WriteLine("Invalid input!");
                }
            }
        }
    }
}
