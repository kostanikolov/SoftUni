using System;
using System.Collections.Generic;
using System.Linq;

namespace Short_words_sorted
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] words = Console.ReadLine()
                .ToLower()
                .Split(new char[] { '.', ',', ':', ';', '(', ')', '[', ']', '"', '\'', '/', '\\', '!', '?', ' ' })
                .Distinct()
                .OrderBy(a => a)
                .Where(w => w != "")
                .Where(x => x.Length < 5)
                .ToArray();

            Console.WriteLine(string.Join(", ", words));
        }
    }
}
