using System;
using System.Text.RegularExpressions;

namespace TestProject
{
    class Program
    {
        static void Main(string[] args)
        {
            string text = "1   2 3      4";
            string pattern = @"\s+";

            string[] result = Regex.Split(text, pattern);
            Console.WriteLine(string.Join(", ", result));
        }
    }
}
