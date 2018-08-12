using System;
using System.Collections.Generic;
using System.IO;

namespace TestProject
{
    class Program
    {
        static void Main(string[] args)
        {
            for (int i = 1; i <= int.MaxValue; i++)
            {
                Console.Write("\r" + "Processing {0} of int.MaxValue", i);
            }
        }
    }
}