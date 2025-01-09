def solution(arr):
    answer = []
    f = 0
    r = len(arr)-1
    for i in range(f ,r+1):
        if arr[i] == 2:
            f = i
            break
    for i in range(r, f-1, -1):
        if arr[i] == 2:
            r = i
            break
            
    if arr[f] != 2 and arr[r] !=2:
        return [-1]
    
    for i in range(f, r+1):
        answer.append(arr[i])

    return answer