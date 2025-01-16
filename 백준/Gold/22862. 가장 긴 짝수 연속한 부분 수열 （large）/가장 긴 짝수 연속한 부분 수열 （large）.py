n, k = map(int, input().split())
s = list(map(int, input().split()))

f = 0
odd_cnt = 0
even_cnt = 0
ans = 0

for r in range(n):
    if s[r] % 2 == 1:
        odd_cnt += 1
    else:
        even_cnt += 1

    while odd_cnt > k:
        if s[f] % 2 == 1:
            odd_cnt -= 1
        else:
            even_cnt -= 1
        f += 1

    ans = max(ans, even_cnt)

print(ans)