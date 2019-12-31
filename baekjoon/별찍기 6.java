import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int k=(num-i)<<1;k>=0;k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
