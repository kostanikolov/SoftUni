using System;
using System.Collections.Generic;
using System.Linq;

namespace Phonebook
{
    class Program
    {
        static void Main(string[] args)
        {
            var phonebook = new Dictionary<string, string>();

            string line;
            while ((line = Console.ReadLine()) != "END")
            {
                string[] tokens = line.Split();

                string command = tokens[0];
                string name = tokens[1];

                switch (command)
                {
                    case "A":
                        string number = tokens[2];
                        if (phonebook.ContainsKey(name))
                        {
                            phonebook[name] = number;
                        }
                        else
                        {
                            phonebook.Add(name, number);
                        }
                        break;

                    case "S":
                        if (phonebook.ContainsKey(name))
                        {
                            string foundNumber = phonebook[name];
                            Console.WriteLine($"{name} -> {foundNumber}");
                        }
                        else
                        {
                            Console.WriteLine($"Contact {name} does not exist.");
                        }
                        break;
                }
            }
        }
    }
}
