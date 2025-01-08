n = int(input())
c = []
dp = []

for i in range(0,n):
    c.append(list(map(int,input().split())))

dp.append(c[0])

for i in range(1, n):
    preR, preG, preB = dp[i-1]
    r = min(preG, preB) + c[i][0]
    g = min(preR, preB) + c[i][1]
    b = min(preR, preG) + c[i][2] 
    dp.append([r,g,b])

print(min(dp[-1]))    