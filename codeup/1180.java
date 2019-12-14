import java.util.*;
public class Main{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       int a,b,temp;
       temp = scan.nextInt();
       a = temp/10;
       b = temp%10;
       temp = (((b*10)+a)*2)%100;
       System.out.println(temp);
       if(temp<=50){
           System.out.print("GOOD");
       }
       else{
           System.out.print("OH MY GOD");
       }
    }
}
