﻿using System;
using System.Linq;

namespace Closest_two_points
{
    class Point
    {
        public int X { get; set; }
        public int Y { get; set; }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Point[] points = ReadPoints();
            Point[] closestPoints = FindClosestTwoPoints(points);

            PrintDistance(closestPoints);

            PrintPoint(closestPoints[0]);
            PrintPoint(closestPoints[1]);
        }

        static Point ReadPoint()
        {
            int[] pointInfo = Console.ReadLine()
                .Split()
                .Select(int.Parse)
                .ToArray();

            Point point = new Point();
            point.X = pointInfo[0];
            point.Y = pointInfo[1];

            return point;
        }

        static void PrintPoint(Point point)
        {
            Console.WriteLine("({0}, {1})", point.X, point.Y);
        }

        static void PrintDistance(Point[] points)
        {
            double distance = CalcDistance(points[0], points[1]);
            Console.WriteLine("{0:F3}", distance);
        }
        
        static double CalcDistance(Point p1, Point p2)
        {
            int deltaX = p2.X - p1.X;
            int deltaY = p2.Y - p1.Y;

            return Math.Sqrt(deltaX * deltaX + deltaY * deltaY);
        }

        static Point[] FindClosestTwoPoints(Point[] points)
        {
            double minDistance = double.MaxValue;
            Point[] closestTwoPoints = null;

            for (int p1 = 0; p1 < points.Length; p1++)
            {
                for (int p2 = p1 + 1; p2 < points.Length; p2++)
                {
                    double distance = CalcDistance(points[p1], points[p2]);

                    if (distance < minDistance)
                    {
                        minDistance = distance;
                        closestTwoPoints = new Point[] { points[p1], points[p2] };
                    }
                }
            }

            return closestTwoPoints;
        }

        static Point[] ReadPoints()
        {
            int n = int.Parse(Console.ReadLine()); // 4

            Point[] points = new Point[n];

            for (int i = 0; i < n; i++)
            {
                points[i] = ReadPoint();
            }

            return points;
        }
    }
}
