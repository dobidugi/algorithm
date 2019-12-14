function solution(arr) {
    var answer = [];
    let  min = arr[0];
    let minindex = 0;
    let index=0;
    if(arr.length <=1) {
        answer.push(-1);
        return answer;
    }
    arr.forEach(ele =>
    {
        if(ele<min){
            min = ele;
            minindex = index;
            index++;
        } else {
            index++;
        }
    });
    arr.splice(minindex,1);
    answer =arr;
    return answer;
}
 let f =solution([4,3,2,1,2]);
console.log(f);