using System;

namespace Unicode_character
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();

            foreach (var letter in input)
            {
                string result = string.Format("{0:x4}", (int) letter);
                Console.Write($"\\u{result}");
            }

            Console.WriteLine();
        }
    }
}
