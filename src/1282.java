import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a==3) System.out.print("2"+" 1");
        if (a==2) System.out.print("1"+" 1");
        if(a!=3 && a!=2){
            for(int i=2;i<a;i++){
            if((i*i<=a) && ((i+1)*(i+1))>=a){
                System.out.print((a-(i*i)) + " " + i);
                break;
                }
            }
        }
    }
}