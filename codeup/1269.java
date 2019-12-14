import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a,b,c,d;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        
        for(int i=0;i<d-1;i++){
            a = (a * b) + c;
            //System.out.println(a);
        }
        System.out.print(a);
    }
}