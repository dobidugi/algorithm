import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] arr = new int[size][size];
        int cnt=1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[j][i]=cnt++;
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}