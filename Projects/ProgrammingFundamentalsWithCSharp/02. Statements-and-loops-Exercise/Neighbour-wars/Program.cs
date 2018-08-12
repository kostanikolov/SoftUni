using System;

namespace Neighbour_wars
{
    class Program
    {
        static void Main(string[] args)
        {
            //            •	First line – Pesho’s damage
            //•	Second line – Gosho’s damage

            int peshoDmg = int.Parse(Console.ReadLine());
            int goshoDmg = int.Parse(Console.ReadLine());

            int peshoHealth = 100;
            int goshoHealth = 100;
            int turns = 0;

            while (true)
            {
                turns++;
                if (turns % 2 == 0)
                {
                    peshoHealth -= goshoDmg;
                    if (peshoHealth <= 0)
                    {
                        Console.WriteLine($"Gosho won in {turns}th round.");
                        return;
                    }
                }
                else
                {
                    goshoHealth -= peshoDmg;
                    if (goshoHealth <= 0)
                    {
                        Console.WriteLine($"Pesho won in {turns}th round.");
                        return;
                    }
                }
                
                if (turns % 2 == 0)
                {
                    Console.WriteLine($"Gosho used Thunderous fist and reduced Pesho to {peshoHealth} health.");
                }
                else
                {
                    Console.WriteLine($"Pesho used Roundhouse kick and reduced Gosho to {goshoHealth} health.");
                }

                if (turns % 3 == 0)
                {
                    goshoHealth += 10;
                    peshoHealth += 10;
                }
            }
        }
    }
}
