using System;

namespace Restaurant_discount
{
    class Program
    {
        static void Main(string[] args)
        {
            int guests = int.Parse(Console.ReadLine());
            string package = Console.ReadLine();

            double price = 0;
            string hall = string.Empty;
            if (guests <= 50)
            {
                hall = "Small Hall";
                price = 2500;
            }
            else if (guests <= 100)
            {
                hall = "Terrace";
                price = 5000;
            }
            else if (guests <= 120)
            {
                hall = "Great Hall";
                price = 7500;
            }
            else
            {
                Console.WriteLine($"We do not have an appropriate hall.");
                return;
            }
            
            switch (package)
            {
                case "Normal":
                    price += 500;
                    price *= 0.95;
                    break;
                case "Gold":
                    price += 750;
                    price *= 0.90;
                    break;
                case "Platinum":
                    price += 1000;
                    price *= 0.85;
                    break;
            }

            double pricePerPerson = price / guests;
            Console.WriteLine($"We can offer you the {hall}");
            Console.WriteLine($"The price per person is {pricePerPerson:f2}$");
        }
    }
}
