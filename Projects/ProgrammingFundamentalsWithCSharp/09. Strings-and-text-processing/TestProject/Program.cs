using System;
using System.Linq;
using System.Text;

namespace TestProject
{
    class Program
    {
        static void Main(string[] args)
        {
            var builder = new StringBuilder(100);

            builder.Append("Hello Maria, how are you?");
            Console.WriteLine(builder);
            Console.WriteLine("-------------");
            builder[6] = 'D';
            Console.WriteLine(builder);
            Console.WriteLine("-------------");
            builder.Remove(5, 6);
            Console.WriteLine(builder);
            Console.WriteLine("-------------");
            builder.Insert(5, " Peter");
            Console.WriteLine(builder);
            Console.WriteLine("-------------");
            builder.Replace("Peter", "George");
            Console.WriteLine(builder);


            Console.ReadKey();
        }
    }
}
