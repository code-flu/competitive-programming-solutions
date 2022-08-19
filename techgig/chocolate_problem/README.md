Mr. Ramanujan is a mathematics teacher in Atmanirbhar School. He is considered the best mathematics teacher because of his teaching methods and interesting problems. He brings interesting problems for students and provides a chocolate to the student who answers it correctly as a prize. Thus, these problems have become popular as Chocolate problems.
Mr. Ramanujan has brought N cards with him and has an integer written

on each one of them. The integers on cards are numbered from 1 to N. He has asked students to arrange the cards in a linear manner. The problem is not simple though as the cards should be arranged in a manner such that the summation of absolute differences between the cards and their neighbours is maximum. The students got confused with the problem and asked Mr. Ramanujan for help.

Mr. Ramanujan provides the below example to help the students.

Example: Suppose there are 4 cards, N = 4. The integer on the card can be any of the values from 1, 2, 3, and 4. The values on the cards are distinct and none will be repeated on any card.

These cards can be arranged in 24 ways but all of them will not yield the maximum sum. It is possible that two or more arrangements give the same maximum sum.

The different ways in which these cards can be arranged are:
{1, 2, 3, 4}, {1, 2, 4, 3}, {1, 3, 2, 4}, {1, 3, 4, 2}, {1, 4, 2, 3}, {1, 4, 3, 2}, {2, 1, 3, 4}, {2, 1, 4, 3}, {2, 3, 1, 4}, {2, 3, 4, 1}, {2, 4, 1, 3}, {2, 4, 3, 1}, {3, 1, 2, 4}, {3, 1, 4, 2}, {3, 2, 1, 4}, {3, 2, 4, 1}, {3, 4, 1, 2}, {3, 4, 2, 1}, {4, 1, 2, 3}, {4, 1, 3, 2}, {4, 2, 1, 3}, {4, 2, 3, 1}, {4, 3, 1, 2}, {4, 3, 2, 1}
The summation of differences of neighbours of arrangement {1, 2, 3, 4}.

For the given cards, the maximum summation of differences of neighbours = 7.

The maximum sum is given by the arrangements {2, 4, 1, 3} and {3, 1, 4, 2}. Both the arrangements yield the same maximum sum i.e., 7.

Akki is one of the students in the class and is eager to get the chocolate from Mr. Ramanujan. He has been trying very hard for hours but is not able to get the correct answers for all the N. He needs your help to solve the problem. Can you help him and provide the correct answers?

Input Format
The first line of input consists of the number of test cases, T.
Next T lines each consists of the number of cards, N.

Constraints
1 lessthan= T lessthan=100
1 lessthan= N lesstha=10000000

Output Format
For each test case, print the maximum sum in a separate line.

Sample TestCase-1
INPUT
5
5
4
3
2
1

OUTPUT
11
7
3
1

Explanation
Test Case 1: Number of cards, N = 5
One of the arrangements giving the maximum sum is {3, 5, 1, 4, 2}. There are other arrangements too which would yield the same maximum sum.

Test Case 2: Number of cards, N = 4.
One of the arrangements giving the maximum sum is {2, 4, 1, 3}

Test Case 3: Number of cards, N = 3
One of the arrangements giving the maximum sum is {1, 3, 2}

Test Case 4: Number of cards, N = 2
There are only two arrangements {1, 2} and {2, 1} and both yield the same maximum sum i.e. 1.

Test Case 5: Number of cards, N = 1
Since there is only 1 card, there is only one arrangement possible {1}. This is the maximum sum and thus answer is 1.