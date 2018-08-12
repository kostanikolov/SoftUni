using System;
using System.Collections.Generic;
using System.Linq;

namespace Phonebook_upgrade
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
                switch (command)
                {
                    case "A":
                        string name = tokens[1];
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
                        name = tokens[1];
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

                    case "ListAll":
                        foreach (var contact in phonebook.OrderBy(c => c.Key))
                        {
                            Console.WriteLine($"{contact.Key} -> {contact.Value}");
                        }
                        break;
                }
            }
        }
    }
}
