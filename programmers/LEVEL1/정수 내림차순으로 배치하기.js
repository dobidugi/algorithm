function solution(n) {
    var answer = 0;
    let str="";
    let f = Array.from(n.toString());
    f.sort((a,b)=>b-a);
    for(let i=0;i<f.length;i++){
        str+=f[i];
    }
    answer = str;
    return parseInt(answer);
}