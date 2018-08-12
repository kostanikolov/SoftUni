using System;

namespace Count_the_integers
{
    class Program
    {
        static void Main(string[] args)
        {
            int count = 0;
            try
            {
                while (true)
                {
                    int integer = int.Parse(Console.ReadLine());
                    count++;
                }
            }
            catch
            {
                Console.WriteLine(count);
            }
        }
    }
}
