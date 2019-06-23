#include <vector>
#include <iostream>
using namespace std;

long long solution(int N) {
  long long answer=0;
  vector<int> arr;
  arr.reserve(N+1);
  for(int j=2;j<=N;j++){
    if(2*j>N) break;
    arr[2*j]=1;
  }
  for(int i=3;i<=N;i+=2){
    for(int j=2;j<=N;j++){
      if(i*j>N) break;
      arr[i*j]=1;
    }
  }
  for(int i=2;i<=N;i++){
    if(arr[i]==0) {
      answer+=i;
    }
  }
    return answer;
}


int main() {
  int n;
  cin >>n;
  cout<<solution(n);
}