using System;
using System.Collections.Generic;
using System.Linq;
using System.IO;

namespace Word_count
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] words = File.ReadAllText("words.txt")
                .ToLower()
                .Split();

            string[] text = File.ReadAllText("text.txt")
                .ToLower()
                .Split(new char[] { '\n', '\r', ' ', '.', ',', '!', '?', '-' }, StringSplitOptions
                .RemoveEmptyEntries);

            var wordCount = new Dictionary<string, int>();

            foreach (string word in words)
            {
                wordCount[word] = 0;
            }

            foreach (string word in text)
            {
                if (wordCount.ContainsKey(word))
                {
                    wordCount[word]++;
                }
            }

            File.Delete("result.txt");

            foreach (var word in wordCount.OrderByDescending(w => w.Value))
            {
                File.AppendAllText("result.txt", $"{word.Key} -> {word.Value}" + Environment.NewLine);
            }
        }
    }
}
