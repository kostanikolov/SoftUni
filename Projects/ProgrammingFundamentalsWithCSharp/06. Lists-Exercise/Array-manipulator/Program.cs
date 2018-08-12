using System;
using System.Collections.Generic;
using System.Linq;

namespace Array_manipulator
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> numbers = Console.ReadLine()
                .Split()
                .Select(int.Parse)
                .ToList();

            string[] command = Console.ReadLine()
                .Split()
                .ToArray();

            while (command[0] != "print")
            {
                if (command[0] == "add")
                {
                    int index = int.Parse(command[1]);
                    int element = int.Parse(command[2]);

                    numbers.Insert(index, element);
                }

                else if (command[0] == "addMany")
                {
                    int index = int.Parse(command[1]);
                    List<int> addNums = new List<int>();

                    for (int i = 2; i < command.Length; i++)
                    {
                        addNums.Add(int.Parse(command[i]));
                    }

                    numbers.InsertRange(index, addNums);
                }

                else if (command[0] == "contains")
                {
                    Console.WriteLine(numbers.IndexOf(int.Parse(command[1])));
                }

                else if (command[0] == "remove")
                {
                    numbers.RemoveAt(int.Parse(command[1]));
                }

                else if (command[0] == "shift")
                {
                    int rotations = int.Parse(command[1]);

                    for (int i = 0; i < rotations; i++)
                    {
                        numbers.Add(numbers[0]);
                        numbers.RemoveAt(0);

                        //int currNum = numbers[0];

                        //for (int j = 1; j < numbers.Count; j++)
                        //{
                        //    numbers[j - 1] = numbers[j];
                        //}

                        //numbers[numbers.Count - 1] = currNum;
                    }
                }

                else if (command[0] == "sumPairs")
                {
                    for (int i = 0; i < numbers.Count - 1; i++)
                    {
                        numbers[i] = numbers[i] + numbers[i + 1];
                        numbers.RemoveAt(i + 1);
                    }
                }
                
                command = Console.ReadLine().Split().ToArray();
            }

            Console.WriteLine($"[{string.Join(", ", numbers)}]");
        }
    }
}
