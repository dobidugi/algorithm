let rCount;

function solution(n) {
    var answer = 0;
    let k = n;
    let rCount = tobin(n);
    let vCount = 0;
    do {
        vCount = tobin(++k);
    }while(rCount!=vCount);
    answer = k;
    return answer;
}

function tobin(n){
    return x((n >>> 0).toString(2));
}

function x(n){
    let count = 0;
    for(let i=0;i<n.length;i++){
        if(n[i]==1){
            count++;
            if(rCount<count) break;
        }
    }
    return count;
}

let res = solution(723123212312321338);
console.log(res);