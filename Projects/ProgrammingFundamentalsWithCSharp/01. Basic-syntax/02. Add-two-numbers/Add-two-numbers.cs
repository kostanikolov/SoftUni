﻿using System;

namespace _02._Add_two_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int n1 = int.Parse(Console.ReadLine());
            int n2 = int.Parse(Console.ReadLine());
            int sum = n1 + n2;
            Console.WriteLine($"{n1} + {n2} = {sum}");
        }
    }
}
