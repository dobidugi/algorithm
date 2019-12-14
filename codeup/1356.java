import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i=0;i<a;i++){
            if(i==0 || i==(a-1)){
                for(int x=0;x<a;x++) System.out.print("*");
            }
            else if(i!=0 || i!=(a-1)){
                for(int j=0;j<a;j++){
                    if(j==0 || j==(a-1))
                        System.out.print("*");
                    else System.out.print(' ');
                }
            }
            System.out.println("");
        }
    }
}