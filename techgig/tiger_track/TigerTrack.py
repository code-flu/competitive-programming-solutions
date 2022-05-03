t = int(input())
for i in range(t):
    n = int(input())
    l = list(map(int, input().split()))
    l.sort()
    res = 0
    for i in range(len(l) - 1):
        res += l[i + 1] - l[i]
    print(res)