function solution(arr) {
    let answer =[];
    let sum=0;
    arr.forEach(ele => sum+=ele);
    answer = sum/arr.length;
    return answer;
}