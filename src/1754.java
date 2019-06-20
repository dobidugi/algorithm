import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st1= scan.next();
        String st2= scan.next();
        if(st1.length()>st2.length()) System.out.printf("%s %s",st2,st1);
        else if(st1.length()<st2.length()) System.out.printf("%s %s",st1,st2);
        else if((st1.length()==st2.length())==true){
            for(int i=0;i<st1.length();i++){
                if(st1.charAt(i)>st2.charAt(i)){
                    System.out.printf("%s %s",st2,st1);
                    break;
                }
                else if (st1.charAt(i)<st2.charAt(i)){
                    System.out.printf("%s %s",st1,st2);
                    break;
                }
            }
        }

    }

}
