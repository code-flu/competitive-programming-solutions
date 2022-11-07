import collections
import itertools

n = int(input())

l = [int(x) for x in input().split(' ')]

end_set = set()
interval = []
end_dict = collections.defaultdict(list)
i =0
fish_set = set()
maxf = 0

for x in input().split(' '):
    end_set.add(int(x)+l[i])
    interval.append((int(x), int(x)+l[i]))
    i += 1


for e in end_set:
    for i, r in enumerate(interval):
        if r[0] <= e <= r[1]:
            end_dict[e].append(i)

x = itertools.combinations_with_replacement(end_set, 2)
for t in itertools.combinations_with_replacement(end_set, 2):
    fish_set.clear()
    fish_set.update(end_dict[t[0]])
    fish_set.update(end_dict[t[1]])
    if len(fish_set) > maxf:
        maxf = len(fish_set)

print(maxf)