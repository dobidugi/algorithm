import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String a,b;
        a = scan.nextLine();
        b ="";
        for(int i=0;i<a.length();i++){
            b += (char)(a.charAt(i)+2);
        }
        System.out.println(b);
        b ="";
        for(int i=0;i<a.length();i++){
            b += (char)(((a.charAt(i)*7)%80)+48);
        }
        System.out.print(b);
    }
}