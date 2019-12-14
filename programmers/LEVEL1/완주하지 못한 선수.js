function solution(participant, completion) {
    let index=0;
    participant.sort();
    completion.sort();
    for(let i = 0; i<participant.length;i++){
        if(participant[i] === completion[i]){
            index++;
        }
        else {
            return participant[i];
        }
    }
}