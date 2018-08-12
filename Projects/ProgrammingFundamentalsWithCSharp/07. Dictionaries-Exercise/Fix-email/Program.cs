using System;
using System.Collections.Generic;
using System.Linq;

namespace Fix_email
{
    class Program
    {
        static void Main(string[] args)
        {
            var users = new Dictionary<string, string>();

            string line;
            while ((line = Console.ReadLine()) != "stop")
            {
                string name = line;
                string email = Console.ReadLine();

                if (email.EndsWith("us") || email.EndsWith("uk"))
                {
                    continue;
                }

                if (users.ContainsKey(name))
                {
                    users[name] = email;
                }
                else
                {
                    users.Add(name, email);
                } 
            }

            foreach (var name in users)
            {
                Console.WriteLine($"{name.Key} -> {name.Value}");
            }
        }
    }
}
