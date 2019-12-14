import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.next().charAt(0);
        if (c=='L'){
            for(int i=0;i<a;i++){
                for(int j=0;j<i;j++) System.out.print(' ');
                for(int j=0;j<b;j++) System.out.print("*");
                System.out.println("");
            }
        }
        else if(c=='R'){
            for(int i=a;i>0;i--){
                for(int j=i-1;j>0;j--) System.out.print(' ');
                for(int j=0;j<b;j++) System.out.print("*");
                System.out.println("");
            }
        }
    }
}