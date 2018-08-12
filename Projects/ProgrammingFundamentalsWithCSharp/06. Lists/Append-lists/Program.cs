using System;
using System.Linq;
using System.Collections.Generic;

namespace Append_lists
{
    class Program
    {
        static void Main(string[] args)
        {
            var textList = Console.ReadLine().Split('|').ToList();

            textList.Reverse();

            foreach (var text in textList)
            {
                var textArr = text.Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);

                var joined = string.Join(" ", textArr);

                Console.Write(joined + " ");
            }
        }
    }
}
