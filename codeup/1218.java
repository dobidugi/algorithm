import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if(a+b>c){
            if(a==b && a==c){
                System.out.print("정삼각형");
            }
            else if((a==b && a!=c) || (b==c && a!=c) || (c==a && b!=c)){
                System.out.print("이등변삼각형");
            }
            else if((a*a)+(b*b)==(c*c)){
                System.out.print("직각삼각형");
            }
            else{
                System.out.print("삼각형");
            }
        }
        else{
            System.out.print("삼각형아님");
        }
    }
}