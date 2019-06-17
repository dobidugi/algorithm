import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int jul = scan.nextInt();
        int cnt = 1;
        int[] arr = new int[size];
        for(int i=0;i<size;i++) arr[i] = scan.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<size;i++){
            if(cnt==jul){
                System.out.println("");
                cnt =1;
            }
            System.out.print(arr[i]+" ");
            cnt++;
        }
    }
}