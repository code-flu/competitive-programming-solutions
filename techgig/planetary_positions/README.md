**Planetary Positions**  
There is a galaxy in a new universe. In the galaxy, there are N planets. All these planets have two types of gravitational power: Type 0 and Type 1. All these planets are positioned in a line. 

There are few rules between the distance of the planets:  
**1**. If two adjacent planets are of same type then distance between them will be 2 light years.  
**2**. If two adjacent planets are of different type then distance between them will be 1 light years. 

You are given Q queries, in each query you have to change the type of ith planet to other type. In each query after updation tell the distance between the starting and the ending planet.  
 > (**Note**: Each update is persistent for further updates.) 

Input Format The first line of input consists of two integers N and Q represenitng the number of planets and number of queries respectively.  
Next line consists of a string S of length N, representing the initial type of the planet.  
The last line consists of Q space separated integers x, representing the updation in xth planet.

**Constraints**   
1<= N, Q<= 10^5  
S contains only 0 and 1 characters  
1<= x <= N  

Output Format For each query, print a single integer in a separate line telling the distance between the first and last planet.

Sample TestCase 1  
**Input**  
 4 3  
 0100  
 1 3 4  
 
**Output**   
5  
5  
6  
