n = int(input())
grid = []
for i in range(n):
    line = list(map(int,input().split('#')))
    grid.append(line)

result = []
max_min = -1000000
for i in range(n):
    for j in range(n):
        mini = 1000000
        for x in range(max(i-1, 0), min(i + 2, n)):
            for y in range(max(j-1, 0), min(j + 2, n)):
                mini = min(mini, grid[x][y])
        if mini > max_min:
            max_min = mini
            result.clear()
            result.append(str(i+1) + "#" + str(j+1))
        elif mini == max_min:
            result.append(str(i+1) + "#" + str(j+1))

for position in result:
    print(position)