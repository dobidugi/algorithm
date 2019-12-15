// 2019 카카오톡 블라인드 테스트

function solution(N, stages) {
    var answer = [];
    let stayPlayer = [];
    let human = stages.length;
    for(let i=0;i<=N;i++){
        stayPlayer[i] = 0;
    }
    stages.forEach(ele => {
        if(ele<=N) {
            stayPlayer[ele]++;
        }
    });
    stayPlayer.shift();
    let index =1;
    stayPlayer.forEach(ele => {
        if(ele!=0) {
            answer.push([index++, ele / human]);
            human -= ele;
        }
        else if(ele==0){
            answer.push([index++,0]);
        }
    });
    answer.sort((a,b)=>
    {
        if(b[1]==a[1]){
            return a[0]-b[0];
        }
        else {
            return b[1]-a[1];
        }
    });
    let res=[];
    answer.forEach(ele=> {
        res.push(ele[0]);
    });
    return res;
}