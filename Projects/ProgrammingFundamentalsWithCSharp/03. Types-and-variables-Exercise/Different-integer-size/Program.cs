using System;
using System.Numerics;

namespace Different_integer_size
{
    class Program
    {
        static void Main(string[] args)
        {
            BigInteger num = BigInteger.Parse(Console.ReadLine());

            bool isSByte = num >= -128 && num <= 127;
            bool isByte = num >= 0 && num <= 255;
            bool isShort = num >= -32768 && num <= 32767;
            bool isUShort = num >= 0 && num <= 65535;
            bool isInt = num >= -2147483648 && num <= 2147483647;
            bool isUInt = num >= uint.MinValue && num <= uint.MaxValue;
            bool isLong = num >= long.MinValue && num <= long.MaxValue;

            if (isSByte || isByte || isShort || isUShort || isInt || isUInt || isLong)
            {
                Console.WriteLine($"{num} can fit in:");

                if (isSByte)
                    Console.WriteLine("* sbyte");
                if (isByte)
                    Console.WriteLine("* byte");
                if (isShort)
                    Console.WriteLine("* short");
                if (isUShort)
                    Console.WriteLine("* ushort");
                if (isInt)
                    Console.WriteLine("* int");
                if (isUInt)
                    Console.WriteLine("* uint");
                if (isLong)
                    Console.WriteLine("* long");
            }
            else
            {
                Console.WriteLine($"{num} can't fit in any type");
            }
        }
    }
}