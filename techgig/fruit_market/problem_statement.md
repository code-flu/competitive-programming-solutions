There are N stalls in a market that are selling fruits. You have to buy an equal amount of fruits from each stall. If a stall does not have enough fruits to offer, then you have to buy all the fruits available in that stall. If you are given the number of fruits that every stall can offer, determine the minimum quantity that you need to buy from each stall such that you have at least K fruits in total.

##### Input Format

-   First line: Integer N denoting the number of stalls
-   Next line: N space-separated integers and quani denoting the i’th integer which determines the quantity of fruits that i’th stall would be offering
-   Next line: Integer Q denoting the number of queries
-   Next Q lines: Integer Ki denoting the minimum amount of fruits needed in total

##### Constraints

1<=N<=105  
1<=quani <=106  
1<=Q<=105  
1<=Ki<=1011  
  

##### Output Format

For each query, print the minimum quantity of fruits that you have to buy from each shop in a new line. Print -1 if it is not possible to buy the required number of fruits.

  

###### Sample TestCase 1

**Input**

5

3 8 4 1 7

5

13

19

3

25

22

  

**Output**

3

6

1

-1

7