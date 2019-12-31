import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int star = 1;
        for(int i=1;i<=num-1;i++){
            for(int j=num-i;j>0;j--){
                System.out.print(" ");
            }
            for(int v=1;v<=star;v++){
                System.out.print("*");
            }
            star+=2;
            System.out.println("");
        }
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