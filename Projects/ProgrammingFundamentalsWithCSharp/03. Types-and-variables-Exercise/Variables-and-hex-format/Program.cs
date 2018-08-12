using System;

namespace Variables_and_hex_format
{
    class Program
    {
        static void Main(string[] args)
        {
            string hexNum = Console.ReadLine();
            int intNum = Convert.ToInt32(hexNum, 16);
            Console.WriteLine(intNum);
        }
    }
}
