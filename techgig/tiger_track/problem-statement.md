Tiger is preparing for an upcoming racing event. His coach has prepared an interesting track for him. There are N objects on a linear track placed at L different locations. The minimum location of the object can be 1. Tiger will run at a constant pace as the race is long. To reach from one location to the other, Tiger takes the time equal to the absolute difference between the two locations. An object will be considered covered if Tiger reaches the object and taps it. The time taken by Tiger to tap the object is negligible and is not considered.


Since they are focused only at the pace and technicalities related to the race and course, they need your help in determining the minimum time Tiger should take to cover all the N objects on the track. Tiger can start and stop at any of the objects.


Example:

Number of objects, N = 4

Locations of N (4) objects = 12 3 10 7


It means Object1 is placed at location 12, Object2 at location 3, Object3 at location 10 and Object4 at location 7.


There are multiple ways in which Tiger can cover the 4 objects.

Object1 -> Object2 -> Object3 -> Object4


Time taken to reach Object2 from Object1 = |12-3| = 9

Time taken to reach Object3 from Object2 = |3-10| 7

Time taken to reach Object4 from Object3 = |10-7| = 3


Total time taken by Tiger = 9 + 7 + 3 = 19


Object2 -> Object4 -> Object3 ->Object1


Time taken to reach Object4 from Object2 = |3-7| = 4

Time taken to reach Object3 from Object4 = |7-10| = 3

Time taken to reach Object1 from Object4 = |10-12| = 2


Total time taken by Tiger = 4 + 3 + 2 = 9


The minimum time taken by Tiger is 9. There can be multiple possible ways to get the minimum time to cover all the objects but the minimum time will not be less than 9.


Can you help Tiger and his coach?




Input Format
The first line of input consists of number of test cases, T

Each test case consists of a block of 2 lines each.
The first line of each test case consists of the number of objects, N.

The second line of each test case consists of N space-separated integers representing the location of each Ni object.



Constraints
1<= T <=10

1<= N <=100

1<= L <=10000



Output Format
For each test case, print the minimum time Tiger should take to cover all the N objects.

Sample TestCase 1
Input
2
3
9 1 5
4
12 3 10 7
Output
8
9
Explanation

Test Case 1:

The route in which Tiger will take minimum time is Object1 -> Object3 -> Object2.


Time taken = |9-5| + |5-1| = 8


Note: There can be other routes too with the same minimum time but the minimum time will not be less than 8.


Test Case 2: As explained in the example.