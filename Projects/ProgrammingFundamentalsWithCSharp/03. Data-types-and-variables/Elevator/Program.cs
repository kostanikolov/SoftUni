using System;

namespace Elevator
{
    class Program
    {
        static void Main(string[] args)
        {
            int people = int.Parse(Console.ReadLine());
            int capacity = int.Parse(Console.ReadLine());

            int courses = people / capacity;
            int addCourse = people % capacity;
            if (addCourse != 0)
            {
                courses++;
            }
            Console.WriteLine(courses);

            //int courses = (int)Math.Ceiling((double)people / capacity);
            //Console.WriteLine(courses);
        }
    }
}
