function solution(n) {
    var answer = '';
    for(let i=2;i<=n+1;i++){
        if(i%2==0) answer+="수";
        else answer+="박";
    }
    return answer;
}