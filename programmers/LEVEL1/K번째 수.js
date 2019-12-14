function solution(array, commands) {
    var answer = [];
    let start,end,index,temparray;
    for(let i=0;i<commands.length;i++){
      start = commands[i][0]-1;
      end = commands[i][1];
      index = commands[i][2]-1;
      temparray = array.slice(start,end);
      temparray.sort((a,b)=>a-b);
      answer.push(temparray[index]);

    }
    return answer;
}