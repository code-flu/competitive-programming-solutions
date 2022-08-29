T = int(input())
for i in range(T):
    N, M = map(int, input().split())
    items = list(map(int, input().split()))
    items.sort()
    left_sum = sum(items[:M])
    left_sum_2 = sum(items[:-M])
    right_sum = sum(items) - left_sum
    right_sum_2 = sum(items) - left_sum_2
    print(max(abs(right_sum_2 - left_sum_2), abs(right_sum - left_sum)))