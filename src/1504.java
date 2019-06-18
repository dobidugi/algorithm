import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        int cnt=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[j][i]=cnt++;
            }
            if(++i==n) break;
            for(int j=n-1;j>=0;j--)
            {
                arr[j][i]=cnt++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
