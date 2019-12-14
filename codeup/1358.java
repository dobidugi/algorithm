import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i=0;i<(a/2)+1;i++){
            for(int j=i;j<(a/2);j++){
                System.out.print(' ');
            }
            for(int v=1;v<=(i*2)+1;v++) System.out.print("*");
            System.out.println("");
        }
    }
}