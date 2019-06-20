import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.printf("2 %s\n",Integer.toBinaryString(a));
        System.out.printf("8 %o\n",a);
        System.out.printf("16 %X\n",a);

    }

}
