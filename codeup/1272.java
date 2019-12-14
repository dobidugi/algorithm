import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a,b;
        int temp =0;
        int i=1;
        a = scan.nextInt();
        b = scan.nextInt();
        if(a%2==0){
            a = (a/2)*10;
        }
        else if(a%2!=0){
            while(true){
                temp = 1+(i-1)*2;
                if(temp==a){
                    a = i;
                    break;
                }
                i++;
                //System.out.print(temp + " " + i);
            }
        }
        if(b%2==0){
            b = (b/2)*10;
        }
        else if(b%2!=0){
            while(true){
                temp = 1+(i-1)*2;
                if(temp==b){
                    b = i;
                    break;
                }
                i++;
                //System.out.print(temp + " " + i);
            }
        }
        System.out.print(a+b);
    }
}