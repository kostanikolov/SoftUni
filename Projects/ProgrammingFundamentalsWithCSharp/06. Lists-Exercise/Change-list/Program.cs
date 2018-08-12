using System;
using System.Linq;
using System.Collections.Generic;

namespace Change_list
{
    class Program
    {
        static void Main(string[] args)
        {
            var numbers = Console.ReadLine().Split().Select(int.Parse).ToList();
            string inputLine = Console.ReadLine();

            while (inputLine != "Even" && inputLine != "Odd")
            {
                string[] command = inputLine
                    .Split()
                    .ToArray();

                if (command[0] == "Delete")
                {
                    int parsedNum = int.Parse(command[1]);

                    while (numbers.Contains(parsedNum))
                    {
                        numbers.Remove(parsedNum);
                    }
                }
                else if (command[0] == "Insert")
                {
                    int element = int.Parse(command[1]);
                    int index = int.Parse(command[2]);

                    numbers.Insert(index, element);
                }

                inputLine = Console.ReadLine();
            }

            if (inputLine == "Even")
            {
                var evenNums = new List<int>();

                foreach (var num in numbers)
                {
                    if (num % 2 == 0)
                    {
                        evenNums.Add(num);
                    }
                }

                Console.WriteLine(string.Join(" ", evenNums));
            }
            else
            {
                var oddNums = new List<int>();

                foreach (var num in numbers)
                {
                    if (num % 2 != 0)
                    {
                        oddNums.Add(num);
                    }
                }

                Console.WriteLine(string.Join(" ", oddNums));
            }
        }
    }
}
