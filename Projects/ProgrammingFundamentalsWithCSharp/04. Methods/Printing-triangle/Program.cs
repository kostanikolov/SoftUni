using System;

namespace Printing_triangle
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            PrintTriangle(n);

            //for (int i = 0; i < n; i++)
            //{
            //    PrintLine(1, i);
            //}

            //PrintLine(1, n);

            //for (int i = n - 1; i >= 0; i--)
            //{
            //    PrintLine(1, i);
            //}
        }

        static void PrintTriangle(int n)
        {
            for (int line = 1; line <= n; line++)
            {
                PrintLine(1, line);
            }

            for (int line = n - 1; line >= 1; line--)
            {
                PrintLine(1, line);
            }
        }

        static void PrintLine(int start, int end)
        {
            for (int i = start; i <= end; i++)
            {
                Console.Write(i + " ");
            }
            Console.WriteLine();
        }
    }
}
