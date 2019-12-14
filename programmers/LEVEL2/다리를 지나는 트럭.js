function solution(bridge_length, weight, truck_weights) {
    var answer;
    let now_weight = 0;
    let bridge = [];
    let count =0;
    for(let i=0;i<bridge_length;i++){
        bridge.push(0);
    }
    while(true){
        if(now_weight===0 && truck_weights.length ===0) {
            break;
        }
        if( truck_weights.length !=0 && truck_weights[0] + now_weight <= weight){
            now_weight -= bridge.shift();
            let temp = truck_weights.shift();
            bridge.push(temp);
            now_weight += temp;
        } else {
            now_weight -= bridge.shift();
            //bridge.push(0);
            if(truck_weights.length!=0 && truck_weights[0] + now_weight <= weight){
                //now_weight -= bridge.shift();
                let temp = truck_weights.shift();
                bridge.push(temp);
                now_weight += temp;
            } else{
                bridge.push(0);
            }
        }
        count++;
    }
    answer = count;
    return answer;
}