def find(tj, res):
    i = tj[2]
    while i > 0:
        t = i - tj[0]
        if t > 0:
            i = t + tj[1]
        else:
            break
        res += 1
    return res


n = int(input())
for i in range(n):
    tj = list(map(int, input().split()))
    print(find(tj,1))