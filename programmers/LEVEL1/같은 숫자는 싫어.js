function solution(arr)
{
    var answer = [];
    let now = arr[0];
    answer.push(arr[0]);
    for(let i=1;i<arr.length;i++){
        if(arr[i]!=now) {
            now = arr[i];
            answer.push(arr[i]);
        }
        
    }
    return answer;
}