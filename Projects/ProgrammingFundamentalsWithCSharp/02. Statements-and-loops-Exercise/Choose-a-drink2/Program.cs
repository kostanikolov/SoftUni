using System;

namespace Choose_a_drink2
{
    class Program
    {
        static void Main(string[] args)
        {
            string profession = Console.ReadLine();
            int quantity = int.Parse(Console.ReadLine());

            double price = 0;
            string product = string.Empty;
            if (profession == "Athlete")
            {
                product = "Water";
                price = 0.70;
            }
            else if (profession == "Businessman" || profession == "Businesswoman")
            {
                product = "Coffee";
                price = 1.00;
            }
            else if (profession == "SoftUni Student")
            {
                product = "Beer";
                price = 1.70;
            }
            else
            {
                product = "Tea";
                price = 1.20;
            }

            double totalPrice = quantity * price;
            Console.WriteLine($"The {profession} has to pay {totalPrice:f2} for the {product}.");
        }
    }
}
