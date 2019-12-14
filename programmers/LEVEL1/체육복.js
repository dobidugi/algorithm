function solution(n, lost, reserve) {
    var answer = 0;
    let list = [];
    for(let i=0;i<=n;i++){
        list[i]=1;
    }
    reserve.forEach(ele=>list[ele]+=1);
    lost.forEach(ele=>list[ele]-=1);
    list[0] = -1;
    reserve.forEach(ele=> {
        if(list[ele]==2){
            if (list[ele - 1] == 0) {
                list[ele - 1] = 1;
                list[ele]-=1;
            } else if (list[ele + 1] == 0) {
                list[ele + 1] = 1;
                list[ele]-=1;
            }
        }
    });

    list.forEach(ele=> {
        if(ele==1 || ele==2) answer++;
    });
    return answer;
}