function solution(num) {
    var answer = 0;
    let count =0;
    while(num!=1){
        if(count ==500) {
            count = -1;
            break;
        }
        if(num%2==0){
            num = num/2;
        } else if (num%2!=0){
            num = (num * 3) + 1;
        }
        count++;
    }
    answer =count;
    return answer;
}