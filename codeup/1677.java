import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                if(((i==0)&&(j==0)) || ((i==0)&&(j==a-1)) || ((i==b-1)&&(j==0)) || ((i==b-1)&&(j==a-1)) ) System.out.print("+");
                else if((i!=0 && j==0) || (i!=0 && j==a-1)) System.out.print("|");
                else if((i==0) || ((i==b-1) && (j!=0))) System.out.print('-');
                else System.out.print(' ');
            }
            System.out.println("");
        }
    }
}