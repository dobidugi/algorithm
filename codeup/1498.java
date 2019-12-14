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
                System.out.print(arr[0]+" ");
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
        
        
        if(a%b==0){
            Arrays.sort(arr);
            System.out.print(arr[0]+" ");
        } 
        else {
            int[] arr2 = new int[cnt];
            for(int i=0;i<cnt;i++) arr2[i] = arr[i];
            Arrays.sort(arr2);
            System.out.print(arr2[0]+" ");
        }
    }
}
