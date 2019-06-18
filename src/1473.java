import java.util.Scanner;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int size2 = scan.nextInt();
        int[][] arr= new int[size][size2];
        int cnt = 1;
        for(int i=size-1;i>=0;i--){
            for(int j=0;j<size2;j++){
                arr[i][j]=cnt++;
            }
            if(--i==-1) break;
            for(int j=size2-1;j>=0;j--){
                arr[i][j]=cnt++;
            }
        }
            
        for(int i=0;i<size;i++){;
            for(int j=0;j<size2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}