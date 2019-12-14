import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int[][] arr = new int[a][a];
        int cnt=1;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                arr[i][j]=cnt++;
            }
        }
        for(int i=0;i<a;i++){
            for(int v=0;v<a;v++){
                System.out.print(arr[i][v]+" ");
            }
            System.out.println();
        }
    }
}
