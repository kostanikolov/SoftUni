using System;
using System.Collections.Generic;
using System.Linq;

namespace TestProject
{
    class Program
    {
        static void Main(string[] args)
        {
            var name = new Dictionary<string, string>();

            name.Add("Kosta", "+359895062165");

            string nameName = name["+359895062165"];

            Console.WriteLine(nameName);
        }
    }
}
