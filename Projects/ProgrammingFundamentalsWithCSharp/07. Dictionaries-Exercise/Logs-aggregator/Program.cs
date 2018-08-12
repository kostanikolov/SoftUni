using System;
using System.Collections.Generic;
using System.Linq;

namespace Logs_aggregator
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, Dictionary<string, int>> logs = new Dictionary<string, Dictionary<string, int>>();

            int counter = int.Parse(Console.ReadLine());

            for (int i = 0; i < counter; i++)
            {
                string line = Console.ReadLine();

                string[] tokens = line.Split(new[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);

                string ip = tokens[0];
                string username = tokens[1];
                int duration = int.Parse(tokens[2]);

                if (logs.ContainsKey(username) == false)
                {
                    logs.Add(username, new Dictionary<string, int>());
                }

                if (logs[username].ContainsKey(ip) == false)
                {
                    logs[username].Add(ip, duration);
                }
                else
                {
                    logs[username][ip] += duration;
                }
            }
            
            foreach (var log in logs.OrderBy(u => u.Key))
            {
                string username = log.Key;
                int totalDuration = log.Value.Sum(i => i.Value);

                string[] ips = log.Value
                    .Keys
                    .OrderBy(i => i)
                    .ToArray();
                
                Console.WriteLine($"{username}: {totalDuration} [{string.Join(", ", ips)}]");
            }
        }
    }
}
