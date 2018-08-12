using System;

namespace _05._Character_stats
{
    class Program
    {
        static void Main(string[] args)
        {
            string character = Console.ReadLine();
            int health = int.Parse(Console.ReadLine());
            int maxHealth = int.Parse(Console.ReadLine());
            int energy = int.Parse(Console.ReadLine());
            int maxEnergy = int.Parse(Console.ReadLine());

            int leftHealth = maxHealth - health;
            int leftEnergy = maxEnergy - energy;
            Console.WriteLine($"Name: {character}");
            Console.WriteLine("Health: |" + new string('|', health) + new string('.', leftHealth) + '|');
            Console.WriteLine("Energy: |" + new string('|', energy) + new string('.', leftEnergy) + '|');
        }
    }
}
