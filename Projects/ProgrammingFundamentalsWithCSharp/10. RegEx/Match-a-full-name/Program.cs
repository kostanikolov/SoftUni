using System;
using System.Text.RegularExpressions;

namespace Match_a_full_name
{
    class Program
    {
        static void Main(string[] args)
        {
            string text = Console.ReadLine();
            string pattern = @"\b[A-Z][a-z]+ [A-Z][a-z]+\b";

            //Regex regex = new Regex(pattern);

            MatchCollection matches = Regex.Matches(text, pattern);

            foreach (Match match in matches)
            {
                Console.Write(match.Value + " ");
            }

            Console.WriteLine();
        }
    }
}
