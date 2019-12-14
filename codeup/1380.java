import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i=1;i<=6;i++){
            for(int j=6;j>0;j--) if(i+j==a) System.out.println(i +" "+j);
        }
    }
}