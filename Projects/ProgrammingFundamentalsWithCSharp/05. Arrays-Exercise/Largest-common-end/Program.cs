using System;
using System.Linq;

namespace Largest_common_end
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] firstArr = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).ToArray();
            string[] secondArr = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).ToArray();

            int length = Math.Min(firstArr.Length, secondArr.Length);

            int equalElements = 0;
            for (int index = 0; index < length; index++)
            {
                if (firstArr[index] == secondArr[index])
                {
                    equalElements++;
                }
            }

            Array.Reverse(firstArr);
            Array.Reverse(secondArr);

            int reversedElements = 0;
            for (int index = 0; index < length; index++)
            {
                if (firstArr[index] == secondArr[index])
                {
                    reversedElements++;
                }
            }

            if (equalElements > reversedElements)
            {
                Console.WriteLine(equalElements);
            }
            else
            {
                Console.WriteLine(reversedElements);
            }
        }
    }
}
