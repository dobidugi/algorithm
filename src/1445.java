import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] arr = new int[a+b];
        for(int i=0;i<a;i++) arr[i] = scan.nextInt();
        for(int i=a;i<a+b;i++) arr[i] = scan.nextInt();
        Arrays.sort(arr);
        for(int i=0; i<a+b;i++) System.out.print(arr[i]+" ");     
        
    }
}
