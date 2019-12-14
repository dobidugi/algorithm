import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a;
        boolean flag = true;
        a = scan.nextInt();
        for(int i=2;i<a;i++){
            if(a%i==0){
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.print("prime");
        }
        else if(flag==false){
            System.out.print("not prime");
        }
    }
}