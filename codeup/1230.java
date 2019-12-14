import java.util.*;
public class Main{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       boolean flag = true;
       int[] d = new int[3];
        for(int i=0;i<3;i++){
            d[i] = scan.nextInt();
        }
        for(int i=0;i<3;i++){
            if(d[i]<=170){
                System.out.print("CRASH "+d[i]);
                flag = false;
                break;
            }
        }
        if(flag==true) System.out.print("PASS");
    }
}