﻿using System;

namespace Practice_floating_points
{
    class Program
    {
        static void Main(string[] args)
        {
            decimal num1 = decimal.Parse(Console.ReadLine()); //3.141592653589793238m; // true
            double num2 = double.Parse(Console.ReadLine()); //1.60217657; // true
            decimal num3 = /*decimal.Parse(Console.ReadLine());*/ 7.8184261974584555216535342341m; // true
            
            Console.WriteLine(num1);
            Console.WriteLine(num2);
            Console.WriteLine(num3);
        }
    }
}
