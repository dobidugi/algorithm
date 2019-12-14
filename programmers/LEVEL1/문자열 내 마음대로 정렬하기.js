function solution(strings, n) {
    let compare = function(a,b){
      if(a[n]<b[n]) return -1;
      else if( a[n]==b[n]){
        if(a<b) return -1;
        else return 1
      } 
      else if ( a[n]>b[n]) return 1;
    }
    let answer = strings.sort(compare);
    return answer;
}