function solution(s) {
    var answer = '';
    let re = "";
    let list = s.split(" ");
    for(let i=0;i<list.length;i++){
        for(let j=0;j<list[i].length;j++){
            if(j==0) answer+=list[i][j].toUpperCase();
            else answer+=list[i][j].toLowerCase();
        }
        answer+=" ";
    }
    for(let i=0;i<answer.length-1;i++){
        re+=answer[i];
    }
    return re;
}