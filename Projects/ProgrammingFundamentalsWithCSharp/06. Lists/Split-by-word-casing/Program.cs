using System;
using System.Linq;
using System.Collections.Generic;

namespace Split_by_word_casing
{
    class Program
    {
        static void Main(string[] args)
        {
            var text = Console.ReadLine()
                    .Split(new char[] { ',', ';', ':', '.', '!', '(', ')', '"', '\'', '\\', '/', '[', ']', ' ' }, StringSplitOptions.RemoveEmptyEntries)
                    .ToList();
                        
            var lowerCaseWords = new List<string>();
            var upperCaseWords = new List<string>();
            var mixedCaseWords = new List<string>();

            foreach (var word in text)
            {
                if (IsUpperWord(word))
                {
                    upperCaseWords.Add(word);
                }
                else if (IsLowerWord(word))
                {
                    lowerCaseWords.Add(word);
                }
                else
                {
                    mixedCaseWords.Add(word);
                }
            }

            Console.WriteLine("Lower-case: {0}", string.Join(", ", lowerCaseWords));
            Console.WriteLine("Mixed-case: {0}", string.Join(", ", mixedCaseWords));
            Console.WriteLine("Upper-case: {0}", string.Join(", ", upperCaseWords));
        }

        static bool IsUpperWord(string word)
        {
            // Pesho

            foreach (char symbol in word)
            {
                if ('A' > symbol || symbol > 'Z')
                {
                    return false;
                }
            }

            return true;
        }

        static bool IsLowerWord(string word)
        {
            foreach (char symbol in word)
            {
                if ('a' > symbol || symbol > 'z')
                {
                    return false;
                }
            }

            return true;
        }
    }
}
