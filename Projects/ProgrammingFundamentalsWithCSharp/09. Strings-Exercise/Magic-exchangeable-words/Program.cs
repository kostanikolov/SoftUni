using System;
using System.Collections.Generic;
using System.Linq;

namespace Magic_exchangeable_words
{
    class Program
    {
        static void Main(string[] args)
        {
            //string[] words = Console.ReadLine() // gosh hapk
            //    .Split()
            //    .Select(w => string.Concat(w.Distinct()))
            //    .ToArray();

            //string firstWord = words[0];
            //string secondWord = words[1];

            //if (firstWord.Length != secondWord.Length)
            //{
            //    Console.WriteLine("false");
            //}
            //else
            //{
            //    Console.WriteLine("true");
            //}

            string[] words = Console.ReadLine().Split();

            string firstWord = words[0];
            string secondWord = words[1];

            Dictionary<char, char> dict = new Dictionary<char, char>();

            int minLength = words.Min(w => w.Length);
            string longerWord;
            if (minLength == firstWord.Length)
            {
                longerWord = secondWord;
            }
            else
            {
                longerWord = firstWord;
            }

            for (int i = 0; i < minLength; i++)
            {
                char firstChar = firstWord[i];
                char secondChar = secondWord[i];

                if (dict.ContainsKey(firstChar) == false)
                {
                    dict.Add(firstChar, secondChar);

                    if (dict.Values.Count(ch => ch == secondChar) > 1)
                    {
                        Console.WriteLine("false");
                        return;
                    }
                }
                else
                {
                    char oldValue = dict[firstChar];

                    if (secondChar != oldValue)
                    {
                        Console.WriteLine("false");
                        return;
                    }
                }
            }

            int maxLength = words.Max(w => w.Length);
            for (int i = minLength; i < maxLength; i++)
            {
                char symbol = longerWord[i];

                if (dict.ContainsValue(symbol) == false && dict.ContainsKey(symbol) == false)
                {
                    Console.WriteLine("false");
                    return;
                }
            }

            Console.WriteLine("true");
        }
    }
}
