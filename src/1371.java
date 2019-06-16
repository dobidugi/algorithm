import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++) System.out.print(' ');
            System.out.print("*");
            for(int j=0;j<i*2;j++) System.out.print(' ');
            System.out.print("*");
            System.out.println("");
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<i;j++) System.out.print(' ');
            System.out.print("*");
            for(int j=((a-i)*2)-2;j>0;j--) System.out.print(' ');
            System.out.print('*');
            System.out.println("");
        }
    }
}