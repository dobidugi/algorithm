import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a;
        a = (int)((n/4.0)*(n/4.0));
        System.out.print(a);
    }
}
