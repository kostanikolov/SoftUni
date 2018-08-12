using System;

namespace Math_power
{
    class Program
    {
        static void Main(string[] args)
        {
            double num = double.Parse(Console.ReadLine());
            int power = int.Parse(Console.ReadLine());
            double result = GetPower(num, power);
            Console.WriteLine(result);
        }

        static double GetPower(double num, int power)
        {
            return Math.Pow(num, power);
        }
    }
}
