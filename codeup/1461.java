import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        for(int i=1;i<=size;i++){
            int cnt=size*i;
            for(int j=0 ;j <size; j++){
                System.out.print((cnt--)+" ");
            }
            System.out.println();
        }
    }
}