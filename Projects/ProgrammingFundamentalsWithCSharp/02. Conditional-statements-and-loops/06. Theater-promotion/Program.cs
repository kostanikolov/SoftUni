using System;

namespace _06._Theater_promotion
{
    class Program
    {
        static void Main(string[] args)
        {
            //The input comes in two lines. On the first line, you will receive the type of day. On the second – the age of the person.

            string typeOfDay = Console.ReadLine();
            int age = int.Parse(Console.ReadLine());

            int price = 0;
            if (age < 0 || age > 122)
            {
                Console.WriteLine("Error!");
                return;
            }
            else if (age <= 18)
            {
                switch (typeOfDay)
                {
                    case "Weekday":
                        price = 12;
                        break;
                    case "Weekend":
                        price = 15;
                        break;
                    case "Holiday":
                        price = 5;
                        break;
                }
            }
            else if (age <= 64)
            {
                switch (typeOfDay)
                {
                    case "Weekday":
                        price = 18;
                        break;
                    case "Weekend":
                        price = 20;
                        break;
                    case "Holiday":
                        price = 12;
                        break;
                }
            }
            else if (age <= 122)
            {
                switch (typeOfDay)
                {
                    case "Weekday":
                        price = 12;
                        break;
                    case "Weekend":
                        price = 15;
                        break;
                    case "Holiday":
                        price = 10;
                        break;
                }
            }
            Console.WriteLine($"{price}$");
        }
    }
}
