using System;

namespace _04._Baverage_labels
{
    class Program
    {
        static void Main(string[] args)
        {
            string product = Console.ReadLine();
            int volume = int.Parse(Console.ReadLine());
            int energy = int.Parse(Console.ReadLine());
            int sugar = int.Parse(Console.ReadLine());

            double totalEnergy = (double)volume * energy / 100;
            double totalSugar = (double)volume * sugar / 100;

            Console.WriteLine($"{volume}ml {product}:");
            Console.WriteLine($"{totalEnergy}kcal, {totalSugar}g sugars");
        }
    }
}
