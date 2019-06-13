import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a,b,res;
        boolean flag = true;
        a = scan.nextInt();
        b = scan.nextInt();
        res = a;
        
        if(b==0){
            flag = false;
            System.out.print("1");
        }
        if(b==1){
            flag = false;
            System.out.println(res);
        }
        if(flag==true){
            for(int i=2;i<=b;i++){
                res *= a;
            }
            System.out.print(res);
        }
    }
}