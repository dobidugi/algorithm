import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i=a;i>0;i--){
            for(int j=i-1;j>0;j--) System.out.print(' ');
            for(int j=0;j<a;j++) System.out.print("*");
            System.out.println("");
        }
    }
}