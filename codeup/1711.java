import java.util.Scanner;
import java.util.Stack;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++) arr[i][j] = scan.nextInt();
        }

        if((arr[0][0]<=arr[2][0]) && (arr[1][0]>=arr[2][0])){
            if((arr[0][1]<=arr[2][1]) && (arr[1][1]>=arr[2][1])) System.out.print("충돌");
            else System.out.print("비충돌");
        } 
        else System.out.print("비충돌");
    }

}
