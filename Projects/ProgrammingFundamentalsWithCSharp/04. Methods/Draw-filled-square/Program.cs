﻿using System;

namespace Draw_filled_square
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            PrintHeaderRow(n);

            for (int i = 1; i <= n-2; i++)
            {
                PrintMiddleRow(n);
            }
            
            PrintHeaderRow(n);
        }
        
        static void PrintHeaderRow(int n)
        {
            Console.WriteLine(new string('-', n * 2));
        }

        static void PrintMiddleRow(int n)
        {
            Console.Write('-');

            for (int i = 1; i < n; i++)
            {
                Console.Write("\\/");
            }

            Console.WriteLine('-');
        }
    }
}
