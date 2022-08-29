# PYTHON SOLUTION 3.7.1 (passed all test cases)

t = int(input())
for i in range(t):
    n = int(input())
    g = int(input())
    prices = list(map(int, input().split()))
    prices.sort()
    print(sum(prices[:n]))