using System;

namespace Exchange_variable_values
{
    class Program
    {
        static void Main(string[] args)
        {
            int num1 = 5;
            int num2 = 10;

            int temp = num1;
            num1 = num2;
            num2 = temp;

            Console.WriteLine($"Before:\r\na = {num2}\r\nb = {num1}");
            Console.WriteLine($"After:\r\na = {num1}\r\nb = {temp}");
        }
    }
}
