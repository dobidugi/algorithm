a, b = map(int, input().split())
list = [0 for i in range(b+1)]
plist = []
for i in range (a):
    plist.append(int(input()))

count = 0
while(len(plist)!=0):
    f = plist.pop()
    j = 1
    if(list[f]==0):
        while(1):
            if((f*j)> b):
                break
            if(list[f*j] == 0):
                count+=1
                list[f*j] = 1
            j+=1

print(count)
