using System;

namespace Convert_speed_units
{
    class Program
    {
        static void Main(string[] args)
        {
            //            •	On first line, you receive – distance in meters
            //•	On second – hours
            //•	On third – minutes
            //•	On fourth – seconds

            int distance = int.Parse(Console.ReadLine());
            int hours = int.Parse(Console.ReadLine());
            int minutes = int.Parse(Console.ReadLine());
            int seconds = int.Parse(Console.ReadLine());

            int time = hours * 3600 + minutes * 60 + seconds;

            double mPerSec = (double)distance / time;
            double kmPerHour = ((double)distance / 1000) / ((double)time / 3600);
            double milesPerHour = ((double)distance / 1609) / ((double)time / 3600);

            Console.WriteLine($"{mPerSec:0.######}");
            Console.WriteLine($"{kmPerHour:0.######}");
            Console.WriteLine($"{milesPerHour:0.######}");
        }
    }
}
