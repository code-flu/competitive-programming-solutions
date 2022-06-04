t = int(input())
while t > 0:
    n, c1, c2 = input().split(" ")
    n, c1, c2 = int(n), int(c1), int(c2)
    ans = (c1 * 0 ** 2) + (c2 * n ** 2)
    for x in range(n + 1):
        temp = (c1 * x ** 2) + (c2 * (n - x) ** 2)
        if temp <= ans:
            ans = temp
        else:
            print(ans)
            break
    t -= 1
