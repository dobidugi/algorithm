function solution(brown, red) {
    var answer = [];
    let f  = brown + red;
    for(let i=1;i<=f;i++){
        if(f%i==0) {
            let m = f / i;
            if(i==m && i*m==f){
                answer=[i,m];
                break;
            }
            if (m < i) {
                let temp = (i - 2) * (m - 2);
                let temp2 = f - temp;
                if (temp == red && temp2 == brown) {
                    answer=[i,m];
                }
            }
        }
    }
    return answer;
}