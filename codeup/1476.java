import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[][] arr = new int[a][b];
        int cnt=1;
        for(int t=0;t<a+b-1;t++){
            for(int i=0;i<b;i++){
                for(int j=0;j<a;j++){
                    if(i+j==t){
                        arr[j][i]=cnt++;
                    }
                }
            }
        }

        for(int i=0;i<a;i++){
            for(int v=0;v<b;v++){
                System.out.print(arr[i][v]+" ");
            }
            System.out.println();
        }
    }
}
