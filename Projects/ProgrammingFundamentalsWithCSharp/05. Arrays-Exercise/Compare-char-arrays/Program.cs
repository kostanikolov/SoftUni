using System;
using System.Linq;

namespace Compare_char_arrays
{
    class Program
    {
        static void Main(string[] args)
        {
            char[] word1 = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(char.Parse).ToArray();
            char[] word2 = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(char.Parse).ToArray();

            if (word1.Length == word2.Length)
            {
                if (word1[0] < word2[0])
                {
                    Console.WriteLine(word1);
                    Console.WriteLine(word2);
                }
                else
                {
                    Console.WriteLine(word2);
                    Console.WriteLine(word1);
                }
            }
            else if (word1.Length > word2.Length)
            {
                Console.WriteLine(word2);
                Console.WriteLine(word1);
            }
            else
            {
                Console.WriteLine(word1);
                Console.WriteLine(word2);
            }
        }
    }
}
