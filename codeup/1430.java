import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10000000];
        int[] arr2 = new int[100000];
        int size = scan.nextInt();
        int temp;
        for(int i=0;i<size;i++){
            temp = scan.nextInt();
            arr[temp] = 1;
        }
        size = scan.nextInt();
        for(int i=0;i<size;i++){
            temp = scan.nextInt();
            if(arr[temp]==1){
                arr2[i] = 1;
            }
            else arr2[i] =0;
        }
        for(int i=0;i<size;i++) System.out.print(arr2[i]+" ");
    }
}