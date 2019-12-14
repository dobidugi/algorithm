import java.util.Scanner;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int size2 = scan.nextInt();
        int[][] arr= new int[size][size2];
        int cnt=size*size2;
        for(int i=0;i<size2;i++){;
            for(int j=0;j<size;j++){
                arr[j][i] = cnt--;
            }
        }

        for(int i=0;i<size;i++){;
            int t = cnt+1;
            for(int j=0;j<size2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}