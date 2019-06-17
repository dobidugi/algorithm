import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int line=0;
        for(int i=1;i<=a*a;i++){
            if(line==a){
                System.out.println();
                line=0;
            }
            System.out.print(i+" ");
            line++;
        }
    }
}