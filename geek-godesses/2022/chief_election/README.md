### Chief Election  (100 Marks)

In the city of La La Land, the sports chief is to be elected. Mr. Jani, who himself is a great athlete, is standing for the position. It looks like a cake for him but it is not so. Throughout his career, he has been involved in many controversies and because of this the people are divided. To challenge him, Ms. Ramya has also submitted her application. She is a fierce lady with a great track record but is considered too strict with her discipline norms.

  

There are multiple departments in the sports authority. On the election day, each department is provided with an integer. It also means multiple persons from the same department have the same integer.

  

Election Rules:

1.  Different persons belonging to the same department, have the same integer.
    
2.  Multiple votes with the same integer will be considered as a single unique vote.
    
3.  To win, Mr. Jani should have atleast M unique votes. If not, then, Ms. Ramya will be elected as the Chief Officer.
    

  

Note: If there are 3 people belonging to one department having an integer 5 and they all vote, then it will be considered as a single unique vote.

  

Now, on election day, N people have casted their vote. The votes are stored and are presented to you. The authority is asking you to declare the winner as per the rules. Declare the election results and name the new Chief Officer.

  

Example:

Number of people who casted their vote, N = 10

Number of minimum votes required by Mr. Jani, M = 6

  

The votes casted are given below,

  

![](https://lh4.googleusercontent.com/p581U88RH06fMD1bjFu-Ns8jo_YPcl55zi8Pstom_inDtmtxDiPudfSuQ_xhHeSG4XbwSGKyFHR5GO_sdO7Nkj2z90ZoO5jehBHbSnUnAEujCZ4h3zjVbZT8JrIbYT8O9jVs5H5gdi833zTE2juJPQ)

There are only 5 unique votes, 1, 2, 3, 4 and 5. Mr. Jani required minimum 6 unique votes to win so Ms. Ramya is the winner.

  

  
  

##### Input Format

The first line of input consists of number of test cases, T

The first line of each test case consists of two space-separated integers, N and M.

The second line of each test case consists of N space-separated integers.

  
  

##### Constraints

1<=T<100

1<= N <=10000

0<= M <=N

1<= Ni <=10000

  

  
  

##### Output Format

For each test case, print JANI if Mr. Jani wins otherwise print RAMYA. The output is case sensitive.  
  

###### Sample TestCase 1

Input

2

10 6

1 2 1 4 1 1 3 1 1 5

6 3

1 2 3 4 2 1

Output

RAMYA

JANI

###### Explanation

Test Case 1: As explained in the example.

Test Case 2: Minimum unique votes required by Mr. Jani is 3. The number of unique votes casted is 4 (1, 2 3 and 4). The winner is Mr. Jani.