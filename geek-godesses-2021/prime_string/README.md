Oddia and Evenia are two friends who love strings and prime numbers. Although they have the same taste and like similar things, they are enemies when it comes to even

and odd numbers. Oddia likes the odd numbers and Evenia likes the even numbers. They have a problem for you to solve. A string S of lowercase letters will be provided

and you have to figure out if the given string is Prime String or not.



Prime String: A string is considered a prime string only if the absolute difference between the sum of odd indexed letters and even indexed letters is completely

divisible by any of the odd prime numbers less than 10.

Note: For calculations, consider the ASCII value of lowercase letters.

Example:

String, S = abcdef

Summation of Odd Indexed letters, O = a + c + e = 97 + 99 + 101 = 297

Summation of Even Indexed letters, E = b + d + f = 98 + 100 + 102 = 300



Absolute Difference = |O-E| = |297-300| = 3
This is completely divisible by 3 and leaves 0 as remainder. 
Thus, the given string is a Prime String. If the string is prime string, 
print Prime String otherwise print Casual String. Can you solve it?

Input Format
The first line of input consists of the number of test cases, T
Next N lines each consist of a string, S.
Note: Read the input from the console.

Constraints

1<= T <=10

2<= |S| <=10000

|S| is the length of the string.

Output Format

For each test case, print Prime String if the string is prime string otherwise print Casual String.