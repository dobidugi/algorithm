function solution(n) {
    n = n.toString();
    var answer = [];
    for(let i=n.length-1;i>=0;i--){
        answer.push(parseInt(n[i]));
    }
    return answer;
}