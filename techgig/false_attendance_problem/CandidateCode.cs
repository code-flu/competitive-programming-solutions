using System;
using System.Collections.Generic;
using System.Linq;

public class Attendance
{
    public static void Main(string[] args)
    {
        // Read the number of students
        int n = int.Parse(Console.ReadLine());

        // Create a set to store the unique roll numbers
        HashSet<int> presentRollNumbers = new HashSet<int>();

        // Read the list of roll numbers and add them to the set
        int[] rollNumbers = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
        for (int i = 0; i < n; i++)
        {
            int rollNumber = rollNumbers[i];
            presentRollNumbers.Add(rollNumber);
        }

        // Find the absent roll numbers by comparing with all possible roll numbers
        List<int> absentRollNumbers = new List<int>();
        for (int i = 1; i <= n; i++)
        {
            if (!presentRollNumbers.Contains(i))
            {
                absentRollNumbers.Add(i);
            }
        }

        // Print the absent roll numbers in ascending order
        absentRollNumbers.Sort();
        foreach (int rollNumber in absentRollNumbers)
        {
            Console.Write(rollNumber + " ");
        }
    }
}
