function solution(s) {
    var answer = true;
    let flag = true;
    let temp;
    if(s.length==4 || s.length==6){
        for(let i=0;i<s.length;i++){
            temp = parseInt(s[i]);
    
            answer = isNaN(temp)==true ? false : true;
            if(answer==false) break;
        }
    }
    else {
        answer = false;
    }
    return answer;
}