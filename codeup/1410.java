import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String a,b;
        a = scan.nextLine();
        int acnt=0,bcnt=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='(') acnt++;
            else if(a.charAt(i)==')') bcnt++;
        }
        System.out.print(acnt+ " "+bcnt);
    }
}