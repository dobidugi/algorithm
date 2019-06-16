import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        for (int v=1;v<=b;v++){
            for(int i=0;i<a;i++){
                for(int j=0;j<i;j++) System.out.print(' ');
                System.out.println("*");
            }
            for(int i=a-1;i>0;i--){
                for(int j=0;j<i-1;j++) System.out.print(' ');
                System.out.println("*");
            }
        }
    }
}