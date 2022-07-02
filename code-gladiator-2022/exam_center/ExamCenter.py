import re


def find_num(x):
    str_n = str(x)
    ret = re.search("(2|14)", str_n)
    if ret is not None:
        return True
    else:
        return False


n = int(input())
curr_index = 1
act_index = 1
while curr_index <= n:
    c = find_num(act_index)
    if not c:
        curr_index += 1
    act_index += 1
print(act_index - 1)