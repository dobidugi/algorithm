import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String a,b;
        a = scan.nextLine();
        b ="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=' ') b+=a.charAt(i);
        }
        System.out.print(b);
    }
}