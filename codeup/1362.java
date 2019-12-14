import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int v=0;
        for(int i=a;i>0;i--) v+=i;
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print(v-- +" ");
            }
            System.out.println("");
        }
    }
}