import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[2]);
    }

}
