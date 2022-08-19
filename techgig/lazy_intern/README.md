### Lazy Intern  (100 Marks)

Deepanshu applied for an internship last month and went through multiple rounds. After all this process, he got selected for the internship and is very excited. He went to the office happily and received the orientation. He got to know that he will be working under the Tech Manager. On the first day at the office, he realized that he has to walk a lot as there are a lot of discussions required and meetings are set every now and then. The manager's cubicle **M** is located far from where he is seated and he has to take a long path to reach him and he is very lazy for this.

The office is divided into two partitions and is separated by space between them. There are N rows of cubicles with four cubicles in each row of partition. All the vacant cubicles are marked with V and all the occupied cubicles are marked with O. There is a distance of one unit between the two rows of cubicles and there is a distance of two units between the two partitions. Between the cubicles in a row of a partition, there is no space or distance.

A representation of the office is provided below with 8 rows of cubicles.

![](https://lh5.googleusercontent.com/YtqB-A4kLYtyDEBCC-J91j6SpKKr8E9vfMRjUqgThDCf3QMi1RLFZCbktT0BFD9piCJnYgC-pVNdhdrf3zHkwLoeWjZ9bx1PjZF1X7iMhEwP5UyZ2DVYFp0soxpmKYk5Cnn6_Y8)

  

Deepanshu is very lazy and he wants to cover as minimum as possible distance to reach the Manager's row in the partition where Manager's cubicle M is located. The limitation is that the movement can be only horizontally or vertically. Deepanshu wants to know the minimum distance he has to cover to reach the Manager's row in the partition where Manager's cubicle M is located and he will figure out the vacant cubicle on his own. He is busy with the work and needs your help to determine the minimum distance he has to cover. Can you help him?

  
  

##### Input Format

The first line of input consists of a single integer N, representing the number of rows in the office.

Next N lines contain the representation of the view plan of cubicles in the office.

  
Note: Space between partitions is represented with space at the location.  

  
  

##### Constraints

1<= N <=1000  
  

##### Output Format

Print the required output in a separate line.  
  

###### Sample TestCase 1

**Input**

8

OOOO OOOM

OVOO OOOO

OOVO OOVO

OOOO OOOO

OOOO OOOO

OOOO OOOO

OOOO OOOO

OOOO VOOO

**Output**

2

###### Explanation

The office representation is as below:

  

![](https://lh6.googleusercontent.com/hBvFoLU4poE3_Y2qwj46J6PNj0mkpFZsWeXa-wOet1xc0-NFww1QIWiMgNLwViCGmNxy8LAl4nKAHShFw1KWGaHm2I-sYs23LsJQFzs8mACAVaGV3Whxzi9dSw0YiedcwErpGNg)

  

There are 4 Vacant Cubicles in the office, located at positions [(2,2), (3,3), (3,7) and (7,5)].

The minimum distance Deepanshu has to cover is 2 units which is possible from the vacant cubicle located at position (3, 7). He can move 2 units vertically and make it to the Manager. Thus, the output is 2.