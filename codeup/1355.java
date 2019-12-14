import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i=a;i>0;i--){
            for(int v=i;v<a;v++){
                System.out.print(' ');
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}