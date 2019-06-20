import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int res=0;
        while(true){
            if(a>=b){
                a = a-b;
                a++;
                res++;
            }
            else break;
           
        }
        System.out.print(res);
    }
}
