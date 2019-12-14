function solution(s) {
    let sS=[];
    let sB=[];
    for(let i=0;i<s.length;i++){
        if(s[i]>='a' && s[i] <='z'){
            sS.push(s[i]);
        } else {
            sB.push(s[i]);
        }
    }
    let st1 = arrayToString(sS.sort().reverse());
    let st2 = arrayToString(sB.sort().reverse());

    return st1+st2;
}
function arrayToString(array){
    let st="";
    for(let i=0;i<array.length;i++){
        st+=array[i];
    }
    return st;

}
console.log(solution("Zbcdefg"));