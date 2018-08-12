using System;

namespace _03._Miles_to_kilometers
{
    class Program
    {
        static void Main(string[] args)
        {
            double miles = double.Parse(Console.ReadLine());
            double kmeters = miles * 1.60934;
            Console.WriteLine($"{kmeters:f2}");
        }
    }
}
