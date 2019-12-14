import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c;
        while(true){
            c = a%b;
            a = b;
            b = c;
            if(b==0) break;
        }
        System.out.print(a);
    }
}
