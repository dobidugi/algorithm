function solution(n) {
    var answer = 0;
    let list = [];
    for(let i=1;i<=n;i++){
        if(n%i==0) list.push(i);
    }
    list.forEach(ele => answer+=ele );
    return answer;
}