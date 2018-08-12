using System;

namespace Geometry_calculator
{
    class Program
    {
        static void Main(string[] args)
        {
            string figure = Console.ReadLine();

            if (figure == "triangle")
            {
                double a = double.Parse(Console.ReadLine());
                double h = double.Parse(Console.ReadLine());
                PrintTriangleArea(a, h);
            }
            else if (figure == "square")
            {
                double a = double.Parse(Console.ReadLine());
                PrintSquareArea(a);
            }
            else if (figure == "rectangle")
            {
                double a = double.Parse(Console.ReadLine());
                double b = double.Parse(Console.ReadLine());
                PrintRectangleArea(a, b);
            }
            else if (figure == "circle")
            {
                double r = double.Parse(Console.ReadLine());
                PrintCircleArea(r);
            }
        }

        static void PrintTriangleArea(double a, double h)
        {
            double area = a * h / 2;
            Console.WriteLine($"{area:f2}");
        }

        static void PrintSquareArea(double a)
        {
            double area = a * a;
            Console.WriteLine($"{area:f2}");
        }

        static void PrintRectangleArea(double a, double b)
        {
            double area = a * b;
            Console.WriteLine($"{area:f2}");
        }

        static void PrintCircleArea(double r)
        {
            double area = r * r * Math.PI;
            Console.WriteLine($"{area:f2}");
        }
    }
}
