import sys
import os

T = int(input())
for i in range(T):
    n, m = map(int, input().split())
    votes = list(map(int, input().split()))
    unique_votes = len(set(votes))
    if unique_votes >= m:
        print("JANI")
    else:
        print("RAMYA")