function solution(arr, divisor) {
    var answer = [];
    arr.forEach(function(ele){
       if(ele%divisor==0) answer.push(ele);
    });
    if(answer.length == 0) answer.push(-1);
    return answer.sort((a,b)=>a-b);
}
console.log(solution([5, 9, 7, 10],5));