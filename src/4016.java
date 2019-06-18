import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int res=1;
        int i=2;
        while(true){
            if(a%i==0 && b%i==0 && c%i==0){
                res*=i;
                a /=i;
                b /=i;
                c /=i;
                
                if(a==1 || b==1 || c==1) break;
            }
            else i++;
            if (i>c) break;
        }
        System.out.print(res);

    }

}
