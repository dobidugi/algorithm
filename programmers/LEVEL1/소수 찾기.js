function solution(n){
    let array = [];
    array.length = n+1;
    for(let i=1;i<=n;i++){
      array[i] = 0;
    }
    let t=2;
    while(1){
      if(t*2>n){
        break;
      }
      else {
        array[t++*2]=1;
      }
    }
    for(let j=3;j<=n;j+=2){
        for(let k=2;k<=n;k++){
          if(j*k>n){
            break;
          } else{
            array[j*k]=1;
          }
        }
    }
    let count=0;
    for(let i=2;i<=n;i++){
      if(array[i]==0) count++;
    }
    return count;
}