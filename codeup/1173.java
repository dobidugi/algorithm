import java.util.*;
public class Main{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       int a,b;
       a = scan.nextInt();
       b = scan.nextInt();
       if(b<30){
           a--;
           b+=60;
           b-=30;
       }
       else{
           b-=30;
       }
       if(a<0){
           a+=24;
       }
       System.out.print(a +" "+b);
    }
}
