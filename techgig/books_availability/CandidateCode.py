n = int(input())
matrix = []
for i in range(n):
    row = list(map(int, input().split()))
    matrix.append(row)

max_sum = -1
max_row_index = -1
for i in range(n):
    row_sum = sum(matrix[i])
    if row_sum > max_sum:
        max_sum = row_sum
        max_row_index = i

print(max_row_index)
