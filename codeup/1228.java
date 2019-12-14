import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double a,b,r1,r2;

        a = scan.nextDouble();
        b = scan.nextDouble();

        r1= (a-100) * 0.9;
        r2 = (b-r1) * 100 / r1;
        if(r2<=10){
            System.out.print("정상");
        }
        else if(r2>=10 && r2<=20){
            System.out.print("과체중");
        }
        else if(r2>20){
            System.out.print("비만");
        }

    }
}