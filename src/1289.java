import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] arr =new int[3];
        for (int i=0;i<3;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr[i] = a*b;
        }
        Arrays.sort(arr);
        System.out.print(arr[2]);
        
    }
}
