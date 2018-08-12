using System;

namespace Hotel
{
    class Program
    {
        static void Main(string[] args)
        {
            //            •	First line: Month – May, June, July, August, September, October or December
            //•	Second line: Nights Count – an integer between[0... 200]

            string month = Console.ReadLine();
            int nights = int.Parse(Console.ReadLine());

            double typeStudio = 0;
            double typeDouble = 0;
            double typeSuite = 0;
            if (month == "May" || month == "October")
            {
                typeStudio = nights * 50;
                typeDouble = nights * 65;
                typeSuite = nights * 75;

                if (nights > 7)
                {
                    switch (month)
                    {
                        case "October":
                            typeStudio -= 50;
                            break;
                    }

                    typeStudio *= 0.95;
                }
            }
            else if (month == "June" || month == "September")
            {
                typeStudio = nights * 60;
                typeDouble = nights * 72;
                typeSuite = nights * 82;

                if (nights > 7)
                {
                    switch (month)
                    {
                        case "September":
                            typeStudio -= 60;
                            break;
                    }
                }

                if (nights > 14)
                {
                    typeDouble *= 0.90;
                }
            }
            else if (month == "July" || month == "August" || month == "December")
            {
                typeStudio = nights * 68;
                typeDouble = nights * 77;
                typeSuite = nights * 89;

                if (nights > 14)
                {
                    typeSuite *= 0.85;
                }
            }

            Console.WriteLine($"Studio: {typeStudio:f2} lv.");
            Console.WriteLine($"Double: {typeDouble:f2} lv.");
            Console.WriteLine($"Suite: {typeSuite:f2} lv.");
        }
    }
}
