function solution(s, n) {
    var answer = '';
    let t;
    for(let i=0;i<s.length;i++){
        if(s[i]===' ') answer+=" ";
        else if(s[i]>="a" && s[i]<="z"){
            t = s[i].charCodeAt(0);
            t = t+n;
            if(t>122){
                t = ((t-122)+97)-1;
            }
            answer += String.fromCharCode(t);
        }
        else {
            t = s[i].charCodeAt(0);
            t = t+n;
            if(t>90){
                t = ((t-90)+65)-1;
            }
            answer += String.fromCharCode(t);
        }
    }
    return answer;
}