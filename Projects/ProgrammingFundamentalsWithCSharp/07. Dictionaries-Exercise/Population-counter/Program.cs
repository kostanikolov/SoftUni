using System;
using System.Collections.Generic;
using System.Linq;

namespace Population_counter
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, Dictionary<string, long>> countryPopulation = new Dictionary<string, Dictionary<string, long>>();

            string line;
            while ((line = Console.ReadLine()) != "report")
            {
                string[] tokens = line.Split('|');

                string town = tokens[0];
                string country = tokens[1];
                long population = long.Parse(tokens[2]);

                if (countryPopulation.ContainsKey(country) == false)
                {
                    countryPopulation.Add(country, new Dictionary<string, long>());
                }

                if (countryPopulation[country].ContainsKey(town) == false)
                {
                    countryPopulation[country].Add(town, population);
                }
                else
                {
                    countryPopulation[country][town] += population;
                }
            }

            Console.WriteLine("---------------");

            foreach (var country in countryPopulation.OrderByDescending(c => c.Value.Sum(t => t.Value)))
            {
                string countryName = country.Key;
                long totalPopulation = country.Value.Sum(t => t.Value);

                Console.WriteLine($"{countryName} (total population: {totalPopulation})");

                Dictionary<string, long> sortedTowns = country.Value
                    .OrderByDescending(t => t.Value)
                    .ToDictionary(x => x.Key, x => x.Value);

                foreach (var town in sortedTowns)
                {
                    Console.WriteLine($"=>{town.Key}: {town.Value}");
                }
            }
        }
    }
}
