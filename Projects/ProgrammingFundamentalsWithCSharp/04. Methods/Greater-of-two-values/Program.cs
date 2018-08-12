using System;

namespace Greater_of_two_values
{
    class Program
    {
        static void Main(string[] args)
        {
            string type = Console.ReadLine();

            if (type == "int")
            {
                int num1 = int.Parse(Console.ReadLine());
                int num2 = int.Parse(Console.ReadLine());
                int result = GetMax(num1, num2);
                Console.WriteLine(result);
            }
            else if (type == "char")
            {
                char ch1 = char.Parse(Console.ReadLine());
                char ch2 = char.Parse(Console.ReadLine());
                char result = GetMax(ch1, ch2);
                Console.WriteLine(result);
            }
            else
            {
                string str1 = Console.ReadLine();
                string str2 = Console.ReadLine();
                string result = GetMax(str1, str2);
                Console.WriteLine(result);
            }
        }

        static int GetMax(int first, int second)
        {
            if (first >= second)
            {
                return first;
            }
            else
            {
                return second;
            }
        }

        static char GetMax(char first, char second)
        {
            if (first >= second)
            {
                return first;
            }
            else
            {
                return second;
            }
        }

        static string GetMax(string first, string second)
        {
            if (first.CompareTo(second) >= 0)
            {
                return first;
            }
            else
            {
                return second;
            }
        }
    }
}
