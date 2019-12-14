function solution(answers) {
    let dab1 = [1,2,3,4,5];
    let dab1Index = 0;
    let dab1Count = 0;
    let dab2 = [ 2, 1, 2, 3, 2, 4, 2, 5];
    let dab2Index = 0;
    let dab2Count =0;
    let dab3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    let dab3Index = 0;
    let dab3Count =0;
    var answer = [];
    for(let i=0;i<answers.length;i++){
        if(answers[i]===dab1[dab1Index]){
            dab1Count++;
            dab1Index++;
            if(dab1Index==5) dab1Index=0;
        }
        else if(answers[i] !=dab1[dab1Index]){
            dab1Index++;
            if(dab1Index==5) dab1Index=0;
        }

        if(answers[i]===dab2[dab2Index]){
            dab2Count++;
            dab2Index++;
            if(dab2Index==8) dab2Index=0;
        }
        else if(answers[i] !=dab2[dab2Index]){
            dab2Index++;
            if(dab2Index==8) dab2Index=0;
        }

        if(answers[i]===dab3[dab3Index]){
            dab3Count++;
            dab3Index++;
            if(dab3Index==10) dab3Index=0;
        }
        else if(answers[i] !=dab3[dab3Index]){
            dab3Index++;
            if(dab3Index==10) dab3Index=0;
        }

    }
    if(dab1Count>= dab2Count && dab1Count>= dab3Count) answer.push(1);
    if(dab2Count>= dab1Count && dab2Count>= dab3Count) answer.push(2);
    if(dab3Count>= dab1Count && dab3Count>= dab2Count) answer.push(3);
    return answer;
}