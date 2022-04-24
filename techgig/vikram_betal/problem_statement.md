Vikram and Betal are best friends. They both like the same things and hate the same things but there is one thing on which they differ. Vikram does not like duplicates and Betal likes duplicates. They have N number of objects sequenced in front of them with each having some value and each object is present at some index. 
Vikram and Betal are fighting over the objects they should include and exclude. Ned, a common friend of both tried resolving the conflict and finding a middle way. After a lot of heated arguments and fights, they were able to agree on a way in which both can be happy and have it in their own way. 

It is mutually decided by all that they will count the pairs of objects which are equal in value but differ in their position (indexes) i.e. A[i] == A[j] but i is not equal to j. 

e.g. Number of Objects, N = 5 


There are 5 objects with values, 10, 20, 10, 30, 20 respectively placed at different indexes 1, 2, 3, 4, 5 respectively. 

The value of Object 1 is equal to the value of Object 3 which is 10. Also, their indexes are different, (i = 1, j = 3) or (i = 3, j =1). 

Similarly, the value of Object 2 and Object 5 are equal, which is 20. Also, their indexes are different, (i = 2, j = 5) or (i = 5, j = 2). 

The total number of such pairs for the given case is 4. 

The three have been in discussion for a long time and are tired now. They need your help in finding all such pairs. Can you do it for them?

Input Format 

The first line of input consists of number of test cases, T 

The first line of each input consists of the number of objects, N 

The second line of each input consists of N space-separated integers, Ai

Note: Read the input from the console. 

Constraints 

1 <= T <=10 

1 <= N <=100000  (10^5) 

1 <= Ai <=1000000  (10^6) 