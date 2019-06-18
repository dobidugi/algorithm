import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int res=1;
        for(int i=2;i<=1000;i++){
            if(a%i==0 && b%i==0 && c%i==0){
                a/=i;
                b/=i;
                c/=i;
                res*=i;
            }
        }
        System.out.print(res);
    }
}
