import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] arr;
        int temp;
        int max=0;
        int size = scan.nextInt();
        arr = new int[100001];
        for(int i=0;i<size;i++){
            temp = scan.nextInt();
            arr[temp]++;
            if(temp>max) max = temp; 
        }
        for(int i=0;i<=max;i++){
            if(arr[i]!=0){
                for(int j=0;j<arr[i];j++){
                     System.out.printf("%d ",i);
                }
            }
        }
    
    }
}
