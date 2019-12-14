function solution(n) {
    var answer;
    let flag = false;
    for(let i=1;i<=n;i++){
        if(i*i==n){
            i+=1;
            answer = i*i;
            flag = true;
            break;
        }
    }
    if(flag==false) answer = -1;
    return answer;
}