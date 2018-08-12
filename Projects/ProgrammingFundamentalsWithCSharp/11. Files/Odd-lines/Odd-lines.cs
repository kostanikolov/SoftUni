using System;
using System.IO;
using System.Linq;

namespace Odd_lines
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] lines = File.ReadAllLines("lines.txt");
            var oddLines = lines.Where((line, index) => index % 2 == 1);
            File.WriteAllLines("odd-lines.txt", oddLines);



            //string[] lines = File.ReadAllLines("lines.txt");

            //File.Delete("odd-lines.txt");

            //for (int i = 1; i < lines.Length; i += 2)
            //{
            //    File.AppendAllText("odd-lines.txt", lines[i] + Environment.NewLine);
            //}
        }
    }
}
