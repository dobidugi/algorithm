import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[][] arr;
        int size = scan.nextInt();
        int temp;
        arr = new int[size][2];
        for(int i=0;i<size;i++){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[i][0]<arr[j][0]){
                    temp =arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = temp;
                    temp =arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.printf("%d %d\n",arr[i][0],arr[i][1]);
        }
    }

}
