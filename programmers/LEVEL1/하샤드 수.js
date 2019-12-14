function solution(x) {
    let answer = false;
    x = x.toString();
    let sum=0;
    for(let i=0;i<x.length;i++){

        sum+= parseInt(x[i]);
    }
    answer = parseInt(x) % parseInt(sum) === 0;
    return answer;
}