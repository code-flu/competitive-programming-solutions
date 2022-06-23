
Rani and Sheena are participating in a game show as a team. The game show is hosted at a beautiful beach and the host has assigned a task to the teams.

  

*Task:*

Each team is provided with an amount **A.** They have to buy two items from the shops at the beach such that the money left with them is minimum or ideally 0. It is always possible to spend all the money. The team spending all the money first and bringing the two items will be the winner. The teams can take the help from any person.

  

Rani and Sheena want to win the task and have decided to take your help as you are competitive and good with mathematics. They were wandering around and figured out a shop with N items. The items are placed linearly along with the price tag attached. They need your help in figuring out the items they should buy which will make them spend all the money. They have the price of N items and you have to tell them which ones to buy in ascending order of their occurrence.

  

**Example:**

Money to spend, A = 60

Number of items , N = 4

  

![](https://lh5.googleusercontent.com/kngCG2RBxQyUfH8V5dNaD-1xXEP2eE7oWEBB2J6G56FsYba8uegiWTBinUXuQEtn7brMVx-28BRS1M23qMW5iC7AcIOwGX7gtyrh_nXFlrwd5UjjbI8cTh39dqNWVtNLT3W0DmM)

  

Rani and Sheena should buy item 3 and item 4 as the summation would equal 60 and they will be left with no money.

  

  
  

##### Input Format

The first line of input consists of number of test cases, T

The first line of each test case consists of the amount of money to spend, A

The second line of each test case consists of the number of items in shop, N

Next line consists of N space-separated integers representing the price of N items where the first value represents the price of the first item and so on.

  
  

##### Constraints

1<= T <=10

2<= A <=10000

2<= N <=10000

1<= Price of item <=10000

  
  

##### Output Format

For each test case, print a space-separated index of the items Rani and Sheena should buy in ascending order.

  
Note: There always exists a unique answer. Indexing is one based.  
  
  

###### Sample TestCase 1

Input

3

10

4

4 5 6 7

9

6

1 2 3 4 4 6

6

4

1 2 3 3

Output

1 3

3 6

3 4

###### Explanation

**Test Case 1:**

Money to spend, A = 10

Summation of Item 1 and Item 3 = 4 + 6 = 10

Money left = 0

Items to be bought 1 and 3.

  

**Test Case 2:**

Money to spend, A = 9

Summation of item 3 and item 6 = 3 + 6 = 9

Money left = 0

Items to be bought 3 and 6

  

**Test Case 3:**

Money to spend, A = 6

Summation of item 3 and item 4 = 3 + 3 = 6

Money left = 0