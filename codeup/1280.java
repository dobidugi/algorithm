import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a,b, res;
        a = scan.nextInt();
        b = scan.nextInt();
        res =0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
                res += (~i)+1;
                System.out.print((~i)+1);
            }
            else{
                res += i;
                System.out.print("+"+i);
            }
        }
        System.out.print("="+res);
    }
}