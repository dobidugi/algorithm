import java.util.Scanner;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        int a=1,b=1,d=1;
        int c= n-r;
        int res;
        for(int i=1;i<=n;i++){
            a  *= i;
        }
        for(int i=1;i<=r;i++){
            b *=i;
        }

        for(int i=1;i<=c;i++){
            d *=i;
        }
        res = a/(b*d);
        System.out.print(res);
        
    }
}
