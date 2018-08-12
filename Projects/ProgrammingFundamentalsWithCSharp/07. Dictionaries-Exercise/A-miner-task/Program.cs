using System;
using System.Collections.Generic;
using System.Linq;

namespace A_miner_task
{
    class Program
    {
        static void Main(string[] args)
        {
            var resources = new Dictionary<string, int>();

            string line;
            while ((line = Console.ReadLine()) != "stop")
            {
                string resource = line;
                int quantity = int.Parse(Console.ReadLine());

                if (resources.ContainsKey(resource))
                {
                    resources[resource] += quantity;
                }
                else
                {
                    resources.Add(resource, quantity);
                }
            }

            foreach (var resource in resources)
            {
                Console.WriteLine($"{resource.Key} -> {resource.Value}");
            }
        }
    }
}
