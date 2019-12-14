function solution(n)
{
    var answer = 0;
    let f = n.toString();
    let sum =0;
    for(let i=0;i<f.length;i++){
        sum += parseInt(f[i]);
    }
    answer = sum;
    return answer;
}