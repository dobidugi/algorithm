import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int cnt=0;
        int j=0;
        int[] arr = new int[b];
        for(int i=0;i<a;i++){
            if(cnt==b){
                Arrays.sort(arr);
                System.out.print(arr[b-1]+" ");
                cnt=0;
                j=0;
                arr = new int[b];
                arr[j] = scan.nextInt();
                j++;     
                cnt++;
            }
            else{
                arr[j] = scan.nextInt();
                j++;
                cnt++;
            }
        }
        
        Arrays.sort(arr);
        System.out.print(arr[b-1]+" "); 
        
    }
}
