import java.util.Scanner;

public class Main{
    public int f(int num){
        int res=0;
        for(int i=1;i<=num;i++) res+=i;
        return res;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Main s = new Main();
        int a = scan.nextInt();
        int res=0;
        for(int i=1;i<=a;i++){
            res+=s.f(i);
        }
        System.out.print(res);
    }
}