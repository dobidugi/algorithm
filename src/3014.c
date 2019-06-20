#include<stdio.h>

int main() {
   int arr[100001] = {0,};
   int max=0;
   int size;
   int temp;
   scanf("%d",&size);
   for(int i=1;i<=size;i++){
        scanf("%d",&temp);
        arr[temp]++;
        if(temp>max) max=temp;
   }
   for(int i=0;i<=max;i++){
       if(arr[i]!=0){
           for(int j=0;j<arr[i];j++){
               printf("%d ",i);
           }
       }
   }
}
