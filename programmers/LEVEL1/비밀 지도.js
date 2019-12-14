// 2018 카카오톡 블라인드
function solution(n, arr1, arr2) {
    let answer = [];
    let temp;
    let str="";
    for(let i=0;i<n;i++){
        temp  = dec2bin(arr1[i] | arr2[i]);
        if(temp.length!=n){
            for(let k=0;k<n-temp.length;k++) str+=" ";
        }
        for(let j=0;j<temp.length;j++){
            if(temp[j]=="1"){
                str+="#";
            } else {
                str+=" ";
            }
        }
        answer.push(str);
        str="";
    }
    return answer;
}
function dec2bin(dec){
    return (dec >>> 0).toString(2);
}