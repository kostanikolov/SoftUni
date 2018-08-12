using System;

namespace Circle_area_12_digit_precision
{
    class Program
    {
        static void Main(string[] args)
        {
            double r = double.Parse(Console.ReadLine());
            double area = Math.PI * r * r;
            Console.WriteLine($"{area:f12}");
        }
    }
}
