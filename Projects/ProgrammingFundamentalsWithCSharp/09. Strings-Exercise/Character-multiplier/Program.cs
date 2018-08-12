using System;

namespace Character_multiplier
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] words = Console.ReadLine().Split();

            string firstWord = words[0];
            string secondWord = words[1];

            int minLength = Math.Min(firstWord.Length, secondWord.Length);

            string longerWord = string.Empty;

            if (firstWord.Length == minLength)
            {
                longerWord = secondWord;
            }
            else 
            {
                longerWord = firstWord;
            }

            int sum = 0;

            for (int i = 0; i < minLength; i++)
            {
                sum += firstWord[i] * secondWord[i];
            }

            for (int i = minLength; i < longerWord.Length; i++)
            {
                sum += longerWord[i];
            }

            Console.WriteLine(sum);
        }
    }
}
