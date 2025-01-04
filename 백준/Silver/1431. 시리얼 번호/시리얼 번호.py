from functools import cmp_to_key


def compare(a, b):
    if len(a) < len(b):
        return -1
    elif len(a) > len(b):
        return 1
    else:
        aCount = 0
        bCount = 0
        for i in range(0, len(a)):
            if '0' <= a[i] <= '9':
                # print(int(a[i]))
                aCount += int(a[i])
            if '0' <= b[i] <= '9':
                # print(int(b[i]))
                bCount += int(b[i])
        # print(aCount, bCount)
        if aCount < bCount:
            return -1
        elif aCount > bCount:
            return 1
        else:
            tmp = sorted([a, b])
            if tmp[0] == a:
                return -1
            else:
                return 1

n = int(input())
list = []

for i in range(0, n):
    list.append(input())

list = sorted(list, key=cmp_to_key(compare))

for i in list:
    print(i)
