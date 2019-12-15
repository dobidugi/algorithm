function solution(s) {
    var answer = '';
    let list = s.split(" ");
    list.sort((a,b)=>a-b);
    answer+= list[0];
    answer+= " ";
    answer+= list[list.length-1];
    return answer;
}