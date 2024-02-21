Candy Shop (100 Marks)

Hanna wants to buy N chocolates for her niece on her birthday. She visits a nearby candy shop and finds that there are only two types of candies in the shop, U and V. The pricing is calculated in a special manner though:

  

If you buy K number of U candies, then you have to pay **C1 * K^2** where **C1** is a constant value.

  

If you buy L number of V candies, then you have to pay **C2 * L^2** where **C2** is a constant value.

  
  

Hanna is not good with calculations and needs your help to find the minimum money she has to pay for **N** chocolates. Can you help her?

  
  

Example:

  

Number of chocolates Hanna wants to buy, **N = 4**

  

**C1 = 2**
  
**C2 = 3**

  
  

There are multiple possible combinations to buy **4** chocolates. The one with the least amount of money spent is our combination.

  
  
|Number of U Candies (K)  | Number of V candies (L)  | Price to Pay for N candies |
|--|--|--|
| 0 | 4 | 2 * 0^2 + 3 * 4^2 = 48 |
| 1 | 3 | 2  2 * 1^2 + 3 * 3^2 = 29 |
| 2 | 2 | 2 * 2^2 + 3 * 2^2 = 20 |
| 3 | 1 | 2 * 3^2 + 3 * 1^2 = 21 |
| 4 | 0 | 2 * 4^2 + 3 * 0^2 = 32 |



Minimum amount of money Hanna has to pay is **20**.

  
  
  
  

**Input Format**

 - The first line consists of the number of test cases, T.
   
 -  The only line of each test case consists of three space-separated
   integers, N (number of chocolates to buy), C1 and C2 respectively.

  
  
  

**Constraints**

1<= T <=10

  

1<= N, C1, C2 <=100000

  
  
  

**Output Format**

For each test case, print the minimum amount Hanna has to pay for N chocolates.

  

**Sample TestCase 1**

**Input**

1

4 2 3

**Output**

20
