using System;
using System.Linq;

namespace Rectangle_position
{
    class Program
    {
        static void Main(string[] args)
        {
            Rectangle r1 = ReadRectangle();
            Rectangle r2 = ReadRectangle();

            if (r1.IsInside(r2))
            {
                Console.WriteLine("Inside");
            }
            else
            {
                Console.WriteLine("Not inside");
            }
        }

       public static Rectangle ReadRectangle()
        {
            var sizes = Console.ReadLine().Split().Select(int.Parse);

            Rectangle rectangle = new Rectangle()
            {
                Left = sizes.First(),
                Top = sizes.Skip(1).First(),
                Width = sizes.Skip(2).First(),
                Height = sizes.Skip(3).First()
            };

            return rectangle; 
        }
    }

    public class Rectangle
    {
        public int Top { get; set; }
        public int Left { get; set; }
        public int Width { get; set; }
        public int Height { get; set; }

        public int Right
        {
            get
            {
                return Left + Width;
            }
        }
        public int Bottom
        {
            get
            {
                return Top + Height;
            }
        }

        public bool IsInside(Rectangle other)
        {
            bool isInLeft = Left >= other.Left;
            bool isInRight = Right <= other.Right;
            bool isInsideHorizontal = isInLeft && isInRight;
            
            bool isInTop = Top >= other.Top;
            bool isInBottom = Bottom <= other.Bottom;
            bool isInsideVertical = isInTop && isInBottom;

            return isInsideHorizontal && isInsideVertical;
        }
    }
}
