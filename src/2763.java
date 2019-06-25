import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int big;
        boolean flag=false;
        if(a>b) big =a;
        else big = b;
        for(int i=2;i<=b;i++){
            if(a%i==0 && b%i==0){
                flag=true;
                break;
            }
        }
        if(flag==false) System.out.print("coprime");
        else System.out.print("no");
    }
}
