int findi(int k){
  int flag=0;
  int i=0;
  for(i=1;i<=n;i++){
    if(d[i]==k){
      flag=1;
      break;
    }
  }
  if(flag==1) return i;
  else return -1;
}