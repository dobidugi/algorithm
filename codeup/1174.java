import java.util.*;
public class Main{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       int a,b,temp;
       a = scan.nextInt();
       b = scan.nextInt();
       temp = (((a+24)*60)+b)-30;
       a = (temp / 60) % 24 ;
       b =  (temp % 60);
       System.out.print(a +" "+b);
    }
}
