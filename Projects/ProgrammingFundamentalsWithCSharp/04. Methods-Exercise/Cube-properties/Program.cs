using System;

namespace Cube_properties
{
    class Program
    {
        static void Main(string[] args)
        {
            double side = double.Parse(Console.ReadLine());
            string propertie = Console.ReadLine();

            if (propertie == "face")
            {
                Console.WriteLine($"{GetFaceDiagonal(side):f2}");
            }
            else if (propertie == "space")
            {
                Console.WriteLine($"{GetSpaceDiagonal(side):f2}");
            }
            else if (propertie == "volume")
            {
                Console.WriteLine($"{GetVolume(side):f2}");
            }
            else if (propertie == "area")
            {
                Console.WriteLine($"{GetSurfaceArea(side):f2}");
            }
        }

        static double GetFaceDiagonal(double side)
        {
            double faceDiagonal = Math.Sqrt(2 * side * side);
            return faceDiagonal;
        }

        static double GetSpaceDiagonal(double side)
        {
            double spaceDiagonal = Math.Sqrt(3 * side * side);
            return spaceDiagonal;
        }

        static double GetVolume(double side)
        {
            double volume = Math.Pow(side, 3);
            return volume;
        }

        static double GetSurfaceArea(double side)
        {
            double surfaceArea = 6 * side * side;
            return surfaceArea;
        }
    }
}
