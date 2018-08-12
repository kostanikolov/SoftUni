using System;

namespace Day_of_week
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] daysOfWeek =
            {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
            };
            int day = int.Parse(Console.ReadLine());

            if (1 <= day && day <= 7)
            {
                Console.WriteLine(daysOfWeek[day - 1]);
            }
            else
            {
                Console.WriteLine("Invalid day!");
            }


        }
    }
}
