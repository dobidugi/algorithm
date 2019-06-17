import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st1 = scan.nextLine();
        String st2 = scan.nextLine();
        String st3 = scan.nextLine();
        if(st1.charAt(st1.length()-1)==st2.charAt(0)){
            if(st2.charAt(st2.length()-1)==st3.charAt(0)){
                if(st1.charAt(0) == st3.charAt(st3.length()-1)) System.out.print("good");
                else System.out.print("bad");
            }
            else System.out.print("bad");
        }
        else System.out.print("bad");
    }
}