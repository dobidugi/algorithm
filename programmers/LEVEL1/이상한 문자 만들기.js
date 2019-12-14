function solution(s) {
    var answer = '';
    let list = s.split(' ');
    let flag;
    for(let i=0;i<list.length;i++){
        flag = true;
        for(let j=0;j<list[i].length;j++){
            if(flag==true) {
                answer += list[i][j].toUpperCase();
                flag = false;
            } else {
                answer += list[i][j].toLowerCase();
                flag = true;
            }
        }
        if(i!=list.length-1) answer+=" ";
    }
    return answer;
}