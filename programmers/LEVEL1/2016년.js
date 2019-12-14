function solution(a, b) {
    let days = [31,29,31,30,31,30,31,31,30,31,30,31];
    let  YO = ["FRI","SAT","SUN","MON","TUE","WED","THU"];
    let totalday = 0;
    var answer = '';
    for(let i=0;i<a-1;i++){
        totalday += days[i];
    }
    totalday+=b-1;
    answer = (YO[(totalday%7)]);
    return answer;
}