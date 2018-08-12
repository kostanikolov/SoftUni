using System;

namespace Strings_and_objects
{
    class Program
    {
        static void Main(string[] args)
        {
            string str1 = "Hello";
            string str2 = "World";
            object obj1 = str1 + " " + str2;
            string final = (string)obj1;
            Console.WriteLine(final);
        }
    }
}
