import java.util.*;
public class Main{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       double a;
       int b;
       double result=0;
       for(int i =0; i<3;i++){
            a = scan.nextDouble();
            b = scan.nextInt();
            result += (a*b);
       }
       System.out.print(String.format("%.1f",result));
       
    }
}
