import java.util.Scanner;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] arr= new int[size][size];
        int cnt=1;
        for(int i=0;i<size;i++){;
            for(int j=size-1;j>=0;j--){
                arr[i][j]=cnt++;
            }
            if(++i==size) break;
            for(int j=0;j<size;j++){
                arr[i][j]=cnt++;
            }
            
            
        }
        for(int i=0;i<size;i++){;
            int t = cnt+1;
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}