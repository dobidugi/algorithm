import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int star =1;
        for(int i=1;i<=num;i++){
            for(int j=num-i;j>0;j--){
                System.out.print(" ");
            }
            for(int v=1;v<=star;v++){
                System.out.print("*");
            }
            star+=2;
            System.out.println("");
        }
    }
}
