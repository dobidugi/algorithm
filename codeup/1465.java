import java.util.Scanner;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int size2 = scan.nextInt();
        int cnt=size*size2;
        for(int i=0;i<size;i++){
            cnt-=size2;
            int t = cnt+1;
            for(int j=0;j<size2;j++){
                System.out.print((t++)+" ");
            }
            System.out.println();
        }
    }
}