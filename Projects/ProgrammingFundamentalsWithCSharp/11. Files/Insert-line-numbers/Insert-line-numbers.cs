using System;
using System.IO;
using System.Linq;

namespace Insert_line_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input = File.ReadAllLines("input.txt");

            var numberedLines = input.Select(
                (line, index) => $"{index + 1}. {line}");

            File.WriteAllLines("output.txt", numberedLines);
        }
    }
}
