int maxi(int a,int b){
  int max = d[a];
  int save = a;
  for(int i=a;i<=b;i++){
    if(d[i]>max){
      max=d[i];
      save =i;
    }
  }
  return save;
}