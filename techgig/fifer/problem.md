
# **Fifer** (100 Marks)

Mr. Ross is the father of five beautiful daughters. He considers them lucky and always works in a way that has something to do with five. He has brought N lottery tickets and each ticket has an integer written on it. Ross wants to find out if the tickets he brought are lucky for him or not. He will take the last digit of each lottery ticket and form a new number. If the new number formed is divisible by five, the tickets are considered Lucky else Unlucky.

  
  

**Example**:

  

**N** = 5

> 12 34 13 46 57

  
  
  
  
  

The new number formed is **24367**. This number is not divisible by 5 so the tickets are Unlucky.

  
  

Ross is busy with work and needs your help in determining the tickets to be lucky or unlucky. Can you help him?

  
  
  
  

**Input Format**

 - The first line of input consists of number of test cases, **T**

  

 - The first line of each test case consists of number of lottery
   tickets, **N**

  

 - The second line of each test case consists of N space-separated
   non-negative integers.

  
  
  

**Constraints**

1<= T <=10

  

1<= N <=10000

  

0<= Ticket Numbers <=100000

  
  
  

**Output Format**

For each test case, print LUCKY if the new number formed is divisible by 5 else print UNLUCKY.

  

**Sample TestCase 1**

**Input**

2

5

12 34 13 46 57

4

25 49 11 15

**Output**

UNLUCKY

LUCKY


**Explanation**

**Test Case 1**: As explained in the example.

  

**Test Case 2**: The new number formed is 5915. This is divisible by 5.