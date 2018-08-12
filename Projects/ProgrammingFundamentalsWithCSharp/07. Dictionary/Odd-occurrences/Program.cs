using System;
using System.Collections.Generic;

namespace Odd_occurrences
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine().ToLower(); // Java C# PHP PHP JAVA C java​
            string[] words = input.Split(); // java c# php php java c java

            var counts = new Dictionary<string, int>();

            foreach (var word in words)
            {
                if (counts.ContainsKey(word))
                {
                    counts[word]++;
                }
                else
                {
                    counts[word] = 1;
                }
            }

            var result = new List<string>();

            foreach (var pair in counts)
            {
                if (pair.Value % 2 != 0)
                {
                    result.Add(pair.Key);
                }
            }
            
            Console.WriteLine(string.Join(", ", result));
        }
    }
}
