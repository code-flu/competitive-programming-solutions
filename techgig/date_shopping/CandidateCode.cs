// Include namespace system
using System;
using System.IO;
public class CandidateCode
{
    public static void Main(String[] args)
    {
        int b = (int)Convert.ToInt64(Console.ReadLine());
        Console.ReadLine();
        
        int[] jeans =  Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
        
        int[] shirts =  Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
        

        var k = 0;
        var mn = 0;
        var pre = -1;
        var flag = 0;
        foreach (int j in jeans)
        {
            foreach (int shirt in shirts)
            {
                var s = j + shirt;
                if (s <= b && flag == 0)
                {
                    pre = s;
                    flag = 1;
                }
                else if (s <= b)
                {
                    mn = s;
                    if (mn > pre)
                    {
                        pre = mn;
                    }
                }
                k = k + 1;
            }
        }
        Console.WriteLine(pre);
    }
}