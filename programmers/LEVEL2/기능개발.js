function solution(progresses, speeds) {
    var answer = [];
    let list = [];
    let progress;
    let day =0;
    let hash = new Map();
    for(let i=0;i<progresses.length;i++){
        progress = progresses[i];
        day  =0;
        for(progress ; progress<100 ; progress+=speeds[i]){
            day++;
        }
        if(day<list[list.length-1]) list.push(list[list.length-1]);
        else list.push(day);
    }
    list.forEach(ele =>{
        if(hash.has(ele)){
            let value = hash.get(ele);
            value+=1;
            hash.set(ele,value);
        }
        else {
            hash.set(ele,1);
        }
    });
    for(let value of hash.values()){
        answer.push(value);
    }
    return answer;
}