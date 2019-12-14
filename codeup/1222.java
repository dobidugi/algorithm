import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        boolean flag = false;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if(a<=90){
            flag=true;
            b++;
        }
        while(flag){
            a+=5;
            if(a>=90){
                break;
            }
            b++;
        }
        if(b==c){
            System.out.print("same");
        }
        else if(b>c){
            System.out.print("win");
        }
        else if(b<c){
            System.out.print("lose");
        }
    }
}